using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using WebApplication1.Models;

namespace WebApplication1.Controllers
{
    public class ProductController : ApiController
    {
        // GET api/<controller>
        private dbemarketingEntities2 db = new dbemarketingEntities2();

        // GET: api/Products
        public List<tbl_product> GetProducts()
        {
            return db.tbl_product.ToList();
        }

        // GET: api/Products/5

        public IHttpActionResult GetProduct(int id)
        {
            tbl_product product = db.tbl_product.Find(id);
            if (product == null)
            {
                return NotFound();
            }

            return Json(product);
        }
    }
    
}
