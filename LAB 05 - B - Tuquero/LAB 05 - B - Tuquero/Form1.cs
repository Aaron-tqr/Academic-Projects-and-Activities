using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace LAB_05___B___Tuquero
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        //For Tax and Processing Fee
        private const decimal DEC_TAX = 0.03M;
        private const decimal DEC_PROCESSING_FEE = 350;

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void lblCalcu_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void btnCompute_Click(object sender, EventArgs e)
        {
            //Constant variale
            const decimal DEC_PROCESS_FEE = 350M;
            const decimal DEC_TAX_RATE = 3 / 100; //or 0.03

            //Input variables
            decimal decPrice;
            int intMonths = 0;
            decimal decInterestRate = 0M;
            decimal decDownPayment = 0M;

            //Get input from textboxes
            decPrice = decimal.Parse(txtItemPrice.Text);
            intMonths = int.Parse(txtPlanMonths.Text);
            decInterestRate = decimal.Parse(txtInterestRate.Text);
            decDownPayment = decimal.Parse(txtDownPayment.Text);


            //Compute Monthly Fee
            decimal decMonthlyFee = 0;
            decMonthlyFee = decPrice / intMonths;

            //Compute monthly interest
            decimal decMonthlyInterest = 0M;
            decMonthlyInterest = decMonthlyFee * (decInterestRate / 100);
            //Compute new monthly cost
            decMonthlyFee += decMonthlyInterest;

            //Compute Total Due
            decimal decTotalDue = 0M;
            decTotalDue = decMonthlyFee * intMonths + DEC_PROCESS_FEE;

            //Add Tax
            decTotalDue = decTotalDue + (decTotalDue * DEC_TAX_RATE);

            //Deduct Downpayment
            decTotalDue = decTotalDue - decDownPayment;

            //New Monthly Fee - incl tax and other fees and less downpayment
            decMonthlyFee = decTotalDue / intMonths;

            //Show Result (OUTPUT)
            txtMonthlyInterest.Text = decMonthlyInterest.ToString("N2");
            txtTotalDue.Text = decTotalDue.ToString("N2");
            txtMonthlyFee.Text = decMonthlyFee.ToString("N2");

        }
    }
}
