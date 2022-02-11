using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Car_Truck_SUV_Demo
{
    class Truck : Automobile
    {
        // Field
        private string _drive;

        // Constructor
        public Truck()
        {
            _drive = "";
        }

        // Drive property
        public string Drive
        {
            get { return _drive; }
            set { _drive = value; }
        }
    }
}
