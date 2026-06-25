/* Project Name: Lab 09 Treeline Resort
 * Developed By: Prince Aaron John J. Tuquero
 * Date Accomplished: June 17, 2023
 * Description: This application allows users to reserve rooms by entering the number of rooms, length of stay,
   number of adult guests, and number of child guests. Each room can accommodate up to six guests. The resort charges
   6,275.00 per room per night, along with a 16.25% sales and lodging tax based on the room charge. Additionally, there
   is a 625.50 resort fee per room per night. The application will calculate and display the total  room charge, tax amount,
   resort fee, and total due for the reservation.
 */
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Lab_09___Tuquero
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        // Declare class-level constant variables
        const int intMAX_PER_ROOM = 6;
        const decimal decDAILY_ROOM_CHARGE = 6275.0M;
        const decimal decTAX_RATE = 0.1625m;
        const decimal decDAILY_RESORT_FEE = 625.5M;
        const string strMAX_MSG = "You have exceeded the maximum guests per room";

        private void button1_Click(object sender, EventArgs e)
        {
            // Declare needed variable
            int intRoomReserved, intNights, intAdults, intChildren, intNumofGuests;
            double dblRoomsRequired;
            decimal decTotalRoomCharge, decTax, decTotalResortFee, decTotalDue;

            // Get user's data
            intRoomReserved = int.Parse(txtRooms.Text);
            intNights = int.Parse(txtNights.Text);
            intAdults = int.Parse(txtAdults.Text);
            intChildren = int.Parse(txtChildren.Text);

            // Compute Total number of guests
            intNumofGuests = intAdults + intChildren;

            // Calculate number of rooms required
            dblRoomsRequired = intNumofGuests / (double)intMAX_PER_ROOM;

            /* Determine wether number of reserved rooms is adequate and either
               display a message or calculate and display the total charge */

            if (intRoomReserved < dblRoomsRequired)
            {
                MessageBox.Show(strMAX_MSG, "Treeline Resort", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            else
            {
                // Calculate Charges
                decTotalRoomCharge = intRoomReserved * intNights * decDAILY_ROOM_CHARGE;
                decTax = decTotalRoomCharge * decTAX_RATE;
                decTotalResortFee = intRoomReserved * intNights * decDAILY_RESORT_FEE;
                decTotalDue = decTotalRoomCharge + decTax + decTotalResortFee;

                // Display charges
                txtRoomFee.Text = decTotalRoomCharge.ToString("n2");
                txtTax.Text = decTax.ToString("n2");
                txtResortFee.Text = decTotalResortFee.ToString("n2");
                txtTotalDue.Text = decTotalDue.ToString("n2");
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
