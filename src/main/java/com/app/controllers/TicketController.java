package com.app.controllers;

import com.app.model.Ticket;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class TicketController {


  @GetMapping("/ticketForm")
   public String getTicketForm(Model model) {
       model.addAttribute("ticketForm", new Ticket());
        return "ticketForm";
   }

  @PostMapping("/createTicket")
    public String createTicketForm(Ticket ticket, Model model) {
    return "ticketForm";
  }

}