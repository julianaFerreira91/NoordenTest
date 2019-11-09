
package br.com.noordentest.controllers;

import br.com.noordentest.models.Client;
import br.com.noordentest.models.Product;
import br.com.noordentest.repository.ClientRepository;
import br.com.noordentest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    
    @Autowired
    private ClientRepository client;
    
    @Autowired
    private ProductRepository product;
    
    @RequestMapping("/")
    public ModelAndView index() {  
        ModelAndView mv = new ModelAndView("views/index");
        Iterable<Client> clients = client.findAll();
        Iterable<Product> products = product.findAll();

        mv.addObject("clients", clients);
        mv.addObject("products", products);

        return mv;
    }
}
