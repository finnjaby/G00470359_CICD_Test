package ie.atu.sample.service;

import ie.atu.sample.dto.BookingResponse;
import ie.atu.sample.model.Booking;
import ie.atu.sample.repository.BookingRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository repository;

    public BookingService(BookingRepository repository) {
        this.repository = repository;
    }

    public static Booking getById(Long id) {
        BookingResponse getById(@PathVariable)
    }

    public Booking createBooking(Booking booking){
        booking.setId();
        return repository.save(booking);
}



    public List<Booking> getAll() {
        return repository.findAll();
    }
}
