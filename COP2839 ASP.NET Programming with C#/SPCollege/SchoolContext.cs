using SPCollege.Models;
using System.Data.Entity;
using System.Data.Entity.ModelConfiguration.Conventions;

namespace SPCollege.DAL
        //For EntityFramework
        public SchoolContext() : base("SchoolContext")
{
}
//For EntityFramework Core
//public SchoolContext(DbContextOptions<SchoolContext> options) : base(options)
//{
//}
public DbSet<Student> Students { get; set; }
public DbSet<Enrollment> Enrollments { get; set; }
public DbSet<Course> Courses { get; set; }
//For Entity Framework
protected override void OnModelCreating(DbModelBuilder modelBuilder)
{
    modelBuilder.Conventions.Remove<PluralizingTableNameConvention>();
}