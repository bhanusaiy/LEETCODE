class Solution {
    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        // Original node -> copied node
        HashMap<Node, Node> map = new HashMap<>();

        // Create all new nodes
        Node current = head;

        while (current != null) {
            map.put(current, new Node(current.val));
            current = current.next;
        }

        // Connect next and random
        current = head;

        while (current != null) {
            Node copy = map.get(current);

            copy.next = map.get(current.next);
            copy.random = map.get(current.random);

            current = current.next;
        }

        return map.get(head);
    }
}