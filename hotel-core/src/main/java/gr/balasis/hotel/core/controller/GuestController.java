package gr.balasis.hotel.core.controller;

import gr.balasis.hotel.context.base.domain.Guest;
import gr.balasis.hotel.context.web.resource.GuestResource;
import gr.balasis.hotel.core.mapper.resourcedomain.RDbaseMapper;
import gr.balasis.hotel.core.mapper.resourcedomain.RDguestMapper;
import gr.balasis.hotel.core.service.BaseService;
import gr.balasis.hotel.core.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/guests")
public class GuestController extends BaseController<Guest, GuestResource>{
    private final GuestService guestService;
    private final RDguestMapper rDguestMapper;

    @Override
    public BaseService<Guest, Long> getBaseService() {
        return guestService;
    }

    @Override
    public RDbaseMapper<GuestResource, Guest> getMapper() {
        return rDguestMapper;
    }
}
