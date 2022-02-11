namespace Colonies
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.selectionListBox = new System.Windows.Forms.ListBox();
            this.okButton = new System.Windows.Forms.Button();
            this.promptLabel = new System.Windows.Forms.Label();
            this.exitButton = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // selectionListBox
            // 
            this.selectionListBox.FormattingEnabled = true;
            this.selectionListBox.Items.AddRange(new object[] {
            "Alabama",
            "Florida",
            "Georgia",
            "Indiana",
            "Nebraska",
            "Tennessee",
            "Texas"});
            this.selectionListBox.Location = new System.Drawing.Point(15, 55);
            this.selectionListBox.Name = "selectionListBox";
            this.selectionListBox.Size = new System.Drawing.Size(214, 95);
            this.selectionListBox.TabIndex = 0;
            // 
            // okButton
            // 
            this.okButton.Location = new System.Drawing.Point(42, 168);
            this.okButton.Name = "okButton";
            this.okButton.Size = new System.Drawing.Size(75, 23);
            this.okButton.TabIndex = 1;
            this.okButton.Text = "OK";
            this.okButton.UseVisualStyleBackColor = true;
            this.okButton.Click += new System.EventHandler(this.okButton_Click);
            // 
            // promptLabel
            // 
            this.promptLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.promptLabel.Location = new System.Drawing.Point(12, 5);
            this.promptLabel.Name = "promptLabel";
            this.promptLabel.Size = new System.Drawing.Size(217, 39);
            this.promptLabel.TabIndex = 2;
            this.promptLabel.Text = "Which of these was one of the 13 original American colonies?";
            this.promptLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // exitButton
            // 
            this.exitButton.Location = new System.Drawing.Point(123, 168);
            this.exitButton.Name = "exitButton";
            this.exitButton.Size = new System.Drawing.Size(75, 23);
            this.exitButton.TabIndex = 3;
            this.exitButton.Text = "Exit";
            this.exitButton.UseVisualStyleBackColor = true;
            this.exitButton.Click += new System.EventHandler(this.exitButton_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(241, 199);
            this.Controls.Add(this.exitButton);
            this.Controls.Add(this.promptLabel);
            this.Controls.Add(this.okButton);
            this.Controls.Add(this.selectionListBox);
            this.Name = "Form1";
            this.Text = "American Colonies";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.ListBox selectionListBox;
        private System.Windows.Forms.Button okButton;
        private System.Windows.Forms.Label promptLabel;
        private System.Windows.Forms.Button exitButton;
    }
}

