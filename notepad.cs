using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Notepad
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void newToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (richTextBox1.Text != "")
            {
                int i = Convert.ToInt32(MessageBox.Show("Do you want to save this !!", "Notepad", MessageBoxButtons.YesNoCancel, MessageBoxIcon.Information));
                if (i == 6)
                {
                    SaveFileDialog SaveFileDialog1 = new SaveFileDialog();
                    SaveFileDialog1.Title = " Save";
                    SaveFileDialog1.Filter = "Text files (*.txt)|*.txt|All files (*.*)|*.*";
                    SaveFileDialog1.InitialDirectory = @"D:\";
                    SaveFileDialog1.ShowDialog();
                    richTextBox1.SaveFile(SaveFileDialog1.FileName);
                }
                else if (i == 7)
                {
                    richTextBox1.Text = "";
                }
            }
        }

        private void openToolStripMenuItem_Click(object sender, EventArgs e)
        {
            OpenFileDialog OpenFileDialog1 = new OpenFileDialog();
            OpenFileDialog1.Title = " Save";
            OpenFileDialog1.Filter = "Text files (*.txt)|*.txt|All files (*.*)|*.*";
            OpenFileDialog1.InitialDirectory = @"D:\";
            OpenFileDialog1.ShowDialog();
            richTextBox1.LoadFile(OpenFileDialog1.FileName);
            this.Name = OpenFileDialog1.FileName;

        }

        private void saveToolStripMenuItem_Click(object sender, EventArgs e)
        {

            SaveFileDialog SaveFileDialog1 = new SaveFileDialog();
            SaveFileDialog1.Title = " Save";
            SaveFileDialog1.Filter = "Text files (*.txt)|*.txt|All files (*.*)|*.*";
            SaveFileDialog1.InitialDirectory = @"D:\";
            SaveFileDialog1.ShowDialog();
            richTextBox1.SaveFile(SaveFileDialog1.FileName);
            this.Name = SaveFileDialog1.FileName;
        }
    }
}
