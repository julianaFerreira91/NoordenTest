package br.com.noordentest.controllers;

import br.com.noordentest.models.Client;
import br.com.noordentest.models.Orders;
import br.com.noordentest.models.Product;
import br.com.noordentest.repository.ClientRepository;
import br.com.noordentest.repository.OrderRepository;
import br.com.noordentest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {
    
    @Autowired
    private OrderRepository repos;
    
    @Autowired
    private ClientRepository cli;
    
    @Autowired
    private ProductRepository prod;
    
    @RequestMapping(value="/orders", method=RequestMethod.GET)
    public ModelAndView index(@RequestParam("client_id") int client_id,
                              @RequestParam("product_id") int product_id) {
        Client  client  = cli.findById(client_id);
        Product product = prod.findById(product_id);
        
        ModelAndView mv = new ModelAndView("views/orders");
        mv.addObject("client", client);
        mv.addObject("product", product); 
        
        return mv;
    }
    
    @RequestMapping(value="/orders", method=RequestMethod.POST)
    public String index(Orders order) {
        repos.save(order);
        
        return "redirect:/";
    }
}
