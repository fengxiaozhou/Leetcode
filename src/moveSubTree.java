import java.util.*;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2021-03-29
 */
public class moveSubTree {
    public Node moveSubTree(Node root, Node p, Node q) { //目标：q.children has p
        //先找出p和q 以及他们的父节点
        Ob ob = dfsFindPre(root, p, q);

        //q.children has p  直接返回即可
        for (Node t : q.children) {
            if (t.val == p.val) {
                return root;
            }
        }
        //q是p的子树
        if (idSub(p, q)) {
            if (ob.p_par.val == -1) {
                ob.q_par.children.remove(q);
                ob.p_par.children.remove(p);
                ob.q.children.add(p);
                return q;
            }else{
                int index = ob.p_par.children.indexOf(p);
                ob.p_par.children.remove(p);
                ob.q_par.children.remove(q);
                ob.q.children.add(p);
                ob.p_par.children.add(index,q);
                return root;
            }
        }

        //p是q的子树
        ob.p_par.children.remove(p);
        ob.q.children.add(p);
        return root;
    }

    private Ob dfsFindPre(Node node, Node p, Node q) { //[p,p_par,q,q_par]
        Ob ob = new Ob();
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(node);
        if (node.val == p.val) {
            ob.setP(node);
            ArrayList<Node> children = new ArrayList<>();
            children.add(node);
            ob.setP_par(new Node(-1, children));
        }
        if (node.val == q.val) {
            ob.setQ(node);
            ArrayList<Node> children = new ArrayList<>();
            children.add(node);
            ob.setQ_par(new Node(-1, children));
        }

        while (!deque.isEmpty()) {
            Node t = deque.pollFirst();
            for (Node n : t.children) {
                if (n.val == p.val) {
                    ob.setP(n);
                    ob.setP_par(t);
                }
                if (n.val == q.val) {
                    ob.setQ(n);
                    ob.setQ_par(t);
                }
                deque.addLast(n);
            }
        }
        return ob;
    }

    private boolean idSub(Node p, Node q) {
        Ob ob = new Ob();
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(p);

        while (!deque.isEmpty()) {
            Node t = deque.pollFirst();
            for (Node x : t.children) {
                if (x.val == q.val) {
                    return true;
                }
                deque.addLast(x);
            }
        }
        return false;
    }
}

class Ob {
    public Node p;
    public Node p_par;
    public Node q;
    public Node q_par;

    public Node getP() {
        return p;
    }

    public void setP(Node p) {
        this.p = p;
    }

    public Node getP_par() {
        return p_par;
    }

    public void setP_par(Node p_par) {
        this.p_par = p_par;
    }

    public Node getQ() {
        return q;
    }

    public void setQ(Node q) {
        this.q = q;
    }

    public Node getQ_par() {
        return q_par;
    }

    public void setQ_par(Node q_par) {
        this.q_par = q_par;
    }
}

class Node {
    public int val;
    public List<Node> children;


    public Node() {
        children = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        children = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _children) {
        val = _val;
        children = _children;
    }
}