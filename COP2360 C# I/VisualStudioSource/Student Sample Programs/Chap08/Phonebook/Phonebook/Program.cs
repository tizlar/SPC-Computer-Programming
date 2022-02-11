using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace Phonebook
{
    struct PhoneBookEntry
    {
        public string name;
        public string phone;
    }

    public partial class Form1 : Form
    {
        // Field to hold a list of PhoneBookEntry objects.
        private List<PhoneBookEntry> phoneList =
             new List<PhoneBookEntry>();


        public Form1()
        {
            InitializeComponent();
        }

        // The ReadFile method reads the contents of the
        // PhoneList.txt file and stores it as PhoneBookEntry
        // objects in the phoneList.
        private void ReadFile()
        {
            try
            {
                StreamReader inputFile; // To read the file
                string line; // To hold a line from the file

                // Create an instance of the PhoneBookEntry structure.
                PhoneBookEntry entry = new PhoneBookEntry();

                // Create a delimiter array.
                char[] delim = { ',' };

                // Open the PhoneList file.
                inputFile = File.OpenText("PhoneList.txt");

                // Read the lines from the file.
                while (!inputFile.EndOfStream)
                {
                    // Read a line from the file.
                    line = inputFile.ReadLine();

                    // Tokenize the line
                    string[] tokens = line.Split(delim);

                    // Store the tokens in the entry object.
                    entry.name = tokens[0];
                    entry.phone = tokens[1];

                    // Add the entry object to the List.
                    phoneList.Add(entry);
                }
            }
            catch (Exception ex)
            {
                // Display an error message.
                MessageBox.Show(ex.Message);
            }
        }

        // The DisplayNames method displays the list of names
        // in the namesListBox control.
        private void DisplayNames()
        {
            foreach (PhoneBookEntry entry in phoneList)
            {
                nameListBox.Items.Add(entry.name);
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            // Read the PhoneList.txt file.
            ReadFile();

            // Display the names.
            DisplayNames();
        }

        private void nameListBox_SelectedIndexChanged(object sender, EventArgs e)
        {
            // Get the index of the selected item.
            int index = nameListBox.SelectedIndex;

            // Display the corresponding phone number.
            phoneLabel.Text = phoneList[index].phone;
        }

        private void exitButton_Click(object sender, EventArgs e)
        {
            // Close the form.
            this.Close();
        }
    }
}
