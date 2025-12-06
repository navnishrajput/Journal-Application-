//package net.project.myFirst.controller;
//
//import net.project.myFirst.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/journal")
//public class JournalEntryController {
//
//
//    private Map<Integer, JournalEntry> journalEntries = new HashMap<>();
//
//
//    @GetMapping
//    public List<JournalEntry> getAll() {
//        return new ArrayList<>(journalEntries.values());
//    }
//
//
//    @GetMapping("id/{myId}")
//    public JournalEntry getJournalEntryById(@PathVariable Integer myId) {
//        return journalEntries.get(myId);
//    }
//
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry) {
//
//        journalEntries.put(myEntry.getId(), myEntry);
//        return true;
//    }
//
//
//    @PutMapping("id/{id}")
//    public JournalEntry updateEntry(@PathVariable Integer id, @RequestBody JournalEntry myEntry) {
//        return journalEntries.put(id, myEntry);
//    }
//
//
//    @DeleteMapping("id/{myId}")
//    public JournalEntry deleteEntry(@PathVariable Integer myId) {
//        return journalEntries.remove(myId);
//    }
//}