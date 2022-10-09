using System;

namespace YoutubeEgitim
{
    class Program
    {
        static void Main(string[] args)
        {
            int sayi1 = 10;
            int sayi2 = 20;
            sayi1= sayi2;
            sayi2 = 100;
            Console.WriteLine(sayi1);

            int[] sayilar1 = new []{1,2,3};
            int[] sayilar2 = new[]{10,20,30};
            sayilar1 = sayilar2;

            sayilar2[0] = 1000;

            Console.Write(sayilar1[0]);
            Console.Write("**********************************");

            //CreditManager creditManager = new CreditManager();
            //creditManager.Calculate();
            //creditManager.Save();

            //Customer customer = new Customer();
            //customer.Id = 1;
            //customer.City = "Ankara";

            //CustomerManager customerManager = new CustomerManager(customer);
            //customerManager.Save();
            //customerManager.Delete();

            //Company company = new Company();
            //company.CompanyName = "ERT Yazılım";
            //company.TaxNumber = "123";
            //company.Id = 2;
            //company.City = "İzmir";

            //CustomerManager customerManager2 = new CustomerManager(new Person());
            //customerManager2.Save();

            //Person person = new Person();
            //person.FirstName = "Çağan Ege";
            //person.LastName = "Ertuğrul";
            //person.NationalIdentity = "123456";
            //person.Id = 3;
            //customer.City = "İzmir";

            CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager() );
            customerManager.GiveCredit();



            Console.ReadLine();
        }

        class CreditManager
        {
            public void Calculate()
            {
                //
                //
                //
                //
                Console.WriteLine("Hesaplandı");
            }
            public void Save()
            {
                //
                //
                //
                //
                Console.WriteLine("Kredi verildi");
            }
        }

        interface ICreditManager
        {
            void Calculate();

            void Save();
        }

        abstract class BaseCreditManager : ICreditManager
        {
            public abstract void Calculate();

            public virtual void Save()
            {
                Console.WriteLine("Kaydedildi");
            }
        }

        class TeacherCreditManager : BaseCreditManager, ICreditManager
        {
            public override void Calculate()
            {
                Console.WriteLine("Öğretmen Kredisi Hesaplandı");
            }

            public override void Save()
            {
                //
                base.Save();
                //
            }
        }

        class MilitaryCreditManager : BaseCreditManager, ICreditManager
        {
            public override void Calculate()
            {
                Console.WriteLine("Asker Kredisi Hesaplandı");
            }
        }

        class CarCreditManager : BaseCreditManager, ICreditManager
        {
            public override void Calculate()
            {
                Console.WriteLine("Araba Kredisi Hesaplandı");
            }

            public void Save()
            {
                Console.WriteLine("Kaydedildi");
            }
        }

        class Customer
        {

            public Customer()
            {
                Console.WriteLine("Müşteri Nesnesi Başlatıldı");
            }
            public int Id { get; set; }
            public string City { get; set; }

        }

        class Person:Customer
        {
            public string FirstName { get; set; }
            public string LastName { get; set; }
            public string NationalIdentity { get; set; }
        }

        class Company : Customer
        {
            public string CompanyName { get; set; }   
            public string TaxNumber { get; set; }   
        }

        class CustomerManager
        {
            private ICreditManager _creditManager
            private Customer _customer;
            public CustomerManager(Customer customer, ICreditManager creditManager)
            {
                _customer = customer;
                _creditManager = creditManager
            }

            public void Save()
            {
                Console.WriteLine("Müşteri kaydedildi: ");
            }
            public void Delete()
            {
                Console.WriteLine("Müşteri silindi: ");
            }

            public void GiveCredit()
            {
                _creditManager.Calculate();
                Console.WriteLine("Kredi verildi");
            }
        }

    }
}