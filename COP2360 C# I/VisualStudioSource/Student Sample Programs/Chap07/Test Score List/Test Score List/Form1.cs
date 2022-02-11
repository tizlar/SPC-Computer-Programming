using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;

namespace Test_Score_List
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void exitButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void getScoresButton_Click(object sender, EventArgs e)
        {
            double averageScore; // To hold the average score
            int numAboveAverage;   // Number of above average scores 
            int numBelowAverage;   // Number of below average scores

            // Create a List to hold the scores.
            List<int> scoresList = new List<int>();

            // Read the scores from the file into the List.
            ReadScores(scoresList);

            // Display the scores.
            DisplayScores(scoresList);

            // Display the average score.
            averageScore = Average(scoresList);
            AverageLabel.Text = averageScore.ToString("n1");

            // Display the number of above average scores.
            numAboveAverage = AboveAverage(scoresList);
            aboveAverageLabel.Text = numAboveAverage.ToString();

            // Display the number of below average scores.
            numBelowAverage = BelowAverage(scoresList);
            belowAverageLabel.Text = numBelowAverage.ToString();
        }

        // The ReadScores method reads the scores from the TestScores.txt file into the scoresList parameter.
        private void ReadScores(List<int> scoresList)
        {
            try
            {
                // Open the TestScores.txt file
                StreamReader inputFile = File.OpenText("TestScores.txt");

                while (!inputFile.EndOfStream)
                {
                    //read scores into list
                    scoresList.Add(int.Parse(inputFile.ReadLine()));
                }
                //close file
                inputFile.Close();
            }
            catch (Exception ex)
            {
                //dispay error message
                MessageBox.Show(ex.Message);
            }
        }

        // The DisplayScores method displays the contents of the scoresList parameter in the ListBox control.
        private void DisplayScores(List<int> scoresList)
        {
            foreach (int score in scoresList)
            {
                testScoresListBox.Items.Add(score);
            }
        }
        // the average method returns the average of the list values
        private double Average(List<int> scoresList)
        {
            //initializes total of values accumulator
            int total = 0;
            // holds average
            double average;
            //calcs the total of the scores
            foreach (int score in scoresList)
            {
                total += score;
            }
            //calc the avg of the scores
            average = (double)total / scoresList.Count;
            //return the results
            return average;
        }

        // The AboveAverage method returns the number of above average scores in scoresList.
        private int AboveAverage(List<int> scoresList)
        {
            int numAbove = 0;       // Accumulator

            // Get the average score.
            double avg = Average(scoresList);

            // Count the number of above average scores.
            foreach (int score in scoresList)
            {
                if (score > avg)
                {
                    numAbove++;
                }
            }
            return numAbove;
        }
        // The BelowAverage method returns the number of below average scores in scoresList.
        private int BelowAverage(List<int> scoresList)
        {
            int numBelow = 0;    // Accumulator
            
            // Get the average score.
            double avg = Average(scoresList);

            // Count the number of below average scores.
            foreach (int score in scoresList)
                {
                if (score < avg)
                    {
                    numBelow++;
                    }
                }

            // Return the number of below average scores.
             return numBelow;
        }

    }
}
//Collaboration Statement: I worked alone.