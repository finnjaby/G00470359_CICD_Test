package ie.atu.sample.controller;

import ie.atu.sample.dto.BookingResponse;
import ie.atu.sample.model.Booking;
import ie.atu.sample.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private final BookingService bookingService;
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
@GetMapping
    public List<Booking> getBookings() {
        return bookingService.getAll();
}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Booking createBooking(@RequestBody Booking booking) {
        return BookingService.createBooking(booking);
    }
@GetMapping("/{id}")
    public Booking getBooking(@PathVariable Long id){
        return BookingService.getById(id);
}

    }
