using System;
using System.Collections.Generic;
using System.Linq;
using System.Windows.Forms;

namespace LAB_06___Tuquero
{
    static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new frmClothingSales());
        }
    }
}
