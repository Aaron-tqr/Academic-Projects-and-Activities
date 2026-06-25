using System;
using System.Collections.Generic;
/* Project:
 * Date:
 * Programmer:
 * Description:This project inputs sales information for clothing.
 * It calculates the extended price and discount for sales.
 * Uses variables, constants, and calculations.
 * Note that no error trapping is included in this version of the program.
*/
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace LAB_06___Tuquero
{
    public partial class frmClothingSales : Form
    {
        public frmClothingSales()
        {
            InitializeComponent();
        }
        // Declare the constant
        private const decimal DEC_DISCOUNT_RATE = 0.3M;
        private decimal decTotalAmount;
        private int intNumberTransactions;

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void btnCalculate_Click(object sender, EventArgs e)
        {
            // Calculate discount and amount due
            // Declare the variables
            int intQuantity;
            decimal decPrice, decAmountDue, decExtendedPrice, decDiscount;

            intQuantity = int.Parse(txtQuantity.Text);

            try
            {
                // Convert input values to numeric and assign to variables.
                intQuantity = int.Parse(txtQuantity.Text);

                try
                {
                    decPrice = decimal.Parse(txtPrice.Text);

                    // Calculate Values
                    decExtendedPrice = intQuantity * decPrice;
                    decDiscount = Decimal.Round((decExtendedPrice * DEC_DISCOUNT_RATE), 2);
                    decAmountDue = decExtendedPrice - decDiscount;
                    decTotalAmount += decAmountDue;
                    intNumberTransactions++;

                    // Format and Display Answers
                    txtExtendedPrice.Text = decExtendedPrice.ToString("C");
                    txtDiscount.Text = decDiscount.ToString("N");
                    txtAmountDue.Text = decAmountDue.ToString("C");

                    // Format and Display Summary Informations
                    txtTotalAmount.Text = decTotalAmount.ToString("C");
                    txtNumberTransactions.Text = intNumberTransactions.ToString();
                }
                catch
                {
                    // Invalid Price
                    MessageBox.Show("Invalid Price", "Data Error");
                    txtPrice.Focus();
                    txtPrice.SelectAll();
                }
            }
            catch
            {
                //Invalid Quantity
                MessageBox.Show("Invalid quantity.", "Data Error");
                txtQuantity.Focus();
                txtQuantity.SelectAll();
            }

        }

        private void btnClear_Click(object sender, EventArgs e)
        {
            // Clear textboxes
            txtQuantity.Clear();
            txtPrice.Clear();
            txtDiscount.Clear();
            txtExtendedPrice.Clear();
            txtAmountDue.Clear();
            txtQuantity.Clear();
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            // End Program
            this.Close();
        }
    }
}
