import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("Test 1")
    public void textExemplu1(){
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest();
        assertEquals("", computerRepairRequest.getOwnerName());
        assertEquals("", computerRepairRequest.getOwnerAddress());
        assertEquals("", computerRepairRequest.getPhoneNumber());
        assertEquals("", computerRepairRequest.getModel());
        assertEquals("", computerRepairRequest.getDate());
        assertEquals("", computerRepairRequest.getProblemDescription());
    }

    @Test
    @DisplayName("Test 2")
    public void textExemplu2(){
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest(1, "name", "address", "phone", "model", "date", "description");
        assertEquals("name", computerRepairRequest.getOwnerName());
        assertEquals("address", computerRepairRequest.getOwnerAddress());
        assertEquals("phone", computerRepairRequest.getPhoneNumber());
        assertEquals("model", computerRepairRequest.getModel());
        assertEquals("date", computerRepairRequest.getDate());
        assertEquals("description", computerRepairRequest.getProblemDescription());
    }
}
