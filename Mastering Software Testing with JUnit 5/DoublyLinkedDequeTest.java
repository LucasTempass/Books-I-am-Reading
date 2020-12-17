import SUT.DoublyLinkedDeque;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodName.class)
@ExtendWith({TestDurationLogger.class})
@DisplayNameGeneration(CamelCaseGenerator.class)
class DoublyLinkedDequeTest {
    
    @RegisterExtension
    static TestRegexConditional regexConditional = new TestRegexConditional(TestRegexConditional.STARTS_WITH_UNDERLINE);
    
    private DoublyLinkedDeque<Integer> list;
    
    @BeforeEach
    void makeNewList() {
        list = new DoublyLinkedDeque<>();
    }
    
    @NullSource
    @ParameterizedTest(name = "--> {0}")
    void throwsWhenInsertingNull(Integer input) {
        assertThrows(NullPointerException.class, () -> list.push(input));
    }
    
    @Nested
    class WhenEmpty {
        
        @Test
        void sizeIsZero() {
            assertEquals(0, list.size());
        }
        
        @Test
        void headAndTailAreEqual() {
            assertEquals(list.peekFirst(), list.peekLast());
        }
        
        @Test
        void popThrowsException() {
            assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.pop());
        }
        
        @Test
        void dequeueThrowsException() {
            assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.dequeue());
        }
        
        @Test
        void peekFirstReturnsNull() {
            assertNull(list.peekFirst());
        }
        
        @Test
        void peekLastReturnsNull() {
            assertNull(list.peekLast());
        }
        
    }
    
    @Nested
    class WhenNotEmpty {
        
        @BeforeEach
        void init() {
            list.push(0);
        }
        
        @Test
        void sizeIsOne() {
            assertEquals(1, list.size());
        }
        
        @Test
        void popReturnsTail() {
            assertEquals(0, list.pop());
        }
        
        @Test
        void dequeueReturnsHead() {
            assertEquals(0, list.dequeue());
        }
        
        @Test
        void peekFirstReturnsHead() {
            assertEquals(0, list.peekFirst());
        }
        
        @Test
        void peekLastReturnsTail() {
            assertEquals(0, list.peekLast());
        }
        
        @Test
        void headAndTailAreEqual() {
            assertEquals(list.peekFirst(), list.peekLast());
        }
        
        @Test
        void isEmptyWhenCleared() {
            list.clear();
            assertEquals(0, list.size());
            
        }
        
        @Nested
        class WhenDual {
            
            @BeforeEach
            void init() {
                list.push(1);
            }
            
            @Test
            void headAndTailAreNotEqual() {
                assertNotEquals(list.peekFirst(), list.peekLast());
            }
            
            @Test
            void sizeIsTwo() {
                assertEquals(2, list.size());
            }
            
            @Test
            void popReturnsTail() {
                assertEquals(1, list.pop());
            }
            
            @Test
            void dequeueReturnsHead() {
                assertEquals(0, list.dequeue());
            }
            
            @Test
            void peekFirstReturnsHead() {
                assertEquals(0, list.peekFirst());
            }
            
            @Test
            void peekLastReturnsTail() {
                assertEquals(1, list.peekLast());
            }
            
            @Test
            void isEmptyWhenCleared() {
                list.clear();
                assertEquals(0, list.size());
                
            }
            
        }
        
    }
    
}