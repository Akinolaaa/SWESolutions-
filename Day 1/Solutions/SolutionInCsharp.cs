using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day1
{
    internal class SolutionInCsharp
    {
        public static string AddNTerm(List<double> arr) => arr.Sum(x => x) == 0 ? "0.00" : arr.Sum(x => x).ToString("0.00");

    }
}
