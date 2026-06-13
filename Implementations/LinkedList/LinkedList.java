/**
 * ╔══════════════════════════════════════════════════╗
 * ║        Singly Linked List — From Scratch         ║
 * ║        Author: Sadik Mondal                      ║
 * ╚══════════════════════════════════════════════════╝
 *
 * Theory:
 * A Linked List is a linear data structure where each element
 * (node) points to the next. Unlike arrays, nodes are NOT stored
 * in contiguous memory — each node holds data + a reference to next.
 *
 * Use Cases:
 * - Dynamic size (no fixed allocation needed)
 * - O(1) insert/delete at head
 * - Base for Stack, Queue, LRU Cache, Adjacency List
 *
 * Complexity:
 * Access:  O(n)
 * Search:  O(n)
 * Insert:  O(1) at head, O(n) at tail
 * Delete:  O(1) at head, O(n) otherwise
 * Space:   O(n)
 */

public class LinkedList<T> {

    // ─────────────────────────────────
    // Node Class
    // ─────────────────────────────────
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // ─────────────────────────────────
    // Fields
    // ─────────────────────────────────
    private Node<T> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    // ─────────────────────────────────
    // Insert Operations
    // ─────────────────────────────────

    /** Insert at beginning — O(1) */
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    /** Insert at end — O(n) */
    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) { head = newNode; size++; return; }
        Node<T> curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = newNode;
        size++;
    }

    /** Insert at index — O(n) */
    public void addAt(int index, T data) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (index == 0) { addFirst(data); return; }
        Node<T> curr = head;
        for (int i = 0; i < index - 1; i++) curr = curr.next;
        Node<T> newNode = new Node<>(data);
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }

    // ─────────────────────────────────
    // Delete Operations
    // ─────────────────────────────────

    /** Delete head — O(1) */
    public T removeFirst() {
        if (head == null) throw new RuntimeException("List is empty");
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    /** Delete tail — O(n) */
    public T removeLast() {
        if (head == null) throw new RuntimeException("List is empty");
        if (head.next == null) { T data = head.data; head = null; size--; return data; }
        Node<T> curr = head;
        while (curr.next.next != null) curr = curr.next;
        T data = curr.next.data;
        curr.next = null;
        size--;
        return data;
    }

    /** Delete by value — O(n) */
    public boolean remove(T data) {
        if (head == null) return false;
        if (head.data.equals(data)) { head = head.next; size--; return true; }
        Node<T> curr = head;
        while (curr.next != null) {
            if (curr.next.data.equals(data)) {
                curr.next = curr.next.next;
                size--;
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    // ─────────────────────────────────
    // Search & Access
    // ─────────────────────────────────

    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node<T> curr = head;
        for (int i = 0; i < index; i++) curr = curr.next;
        return curr.data;
    }

    public boolean contains(T data) {
        Node<T> curr = head;
        while (curr != null) {
            if (curr.data.equals(data)) return true;
            curr = curr.next;
        }
        return false;
    }

    // ─────────────────────────────────
    // Classic Interview Operations
    // ─────────────────────────────────

    /** Reverse the list — O(n) */
    public void reverse() {
        Node<T> prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    /** Find middle node using slow/fast pointer — O(n) */
    public T findMiddle() {
        if (head == null) throw new RuntimeException("List is empty");
        Node<T> slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    /** Detect cycle (Floyd's Algorithm) — O(n) */
    public boolean hasCycle() {
        Node<T> slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    // ─────────────────────────────────
    // Utility
    // ─────────────────────────────────

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HEAD → ");
        Node<T> curr = head;
        while (curr != null) {
            sb.append(curr.data);
            if (curr.next != null) sb.append(" → ");
            curr = curr.next;
        }
        sb.append(" → NULL");
        return sb.toString();
    }

    // ─────────────────────────────────
    // Test
    // ─────────────────────────────────
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addFirst(0);
        System.out.println(list);          // HEAD → 0 → 1 → 2 → 3 → NULL
        System.out.println("Middle: " + list.findMiddle()); // 1 or 2
        list.reverse();
        System.out.println(list);          // HEAD → 3 → 2 → 1 → 0 → NULL
    }
}
