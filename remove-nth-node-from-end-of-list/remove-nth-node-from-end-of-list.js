/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {
    
    // get size of the real lt
    let size = getSize(head);
    
    // create a dummy node 
    let dummyNode = new ListNode(0);
    dummyNode.next = head;
    
    let node = dummyNode;
    let counter = 0;
    while(node) {
        // increment the counter
        counter++;
        if(counter == size - n + 1) {
            node.next = node.next.next;
            break;
        }
            
        node = node.next;
    }
    
    return dummyNode.next;
};

function getSize(node) {
    let counter = 0;
    if(!node) {
        return counter;
    }
    while(node) {
        counter++;
        node = node.next;
    }
    return counter;
}