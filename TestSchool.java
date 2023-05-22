import java.sql.*;
public class TestSchool {
    public class Main {
        // 数据库连接信息
        private static final String URL = "jdbc:mysql://localhost:3306/database_name";
        private static final String USERNAME = "your_username";
        private static final String PASSWORD = "your_password";

        public static void main(String[] args) {
            Connection conn = null;
            try {
                // 连接数据库
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                // 查询Warehouse表的所有数据
                queryWarehouseTable(conn);
                // 查询Storekeeper表的所有数据
                queryStorekeeperTable(conn);
                // 查询WarehouseItem表的所有数据
                queryWarehouseItemTable(conn);
                // 查询Item表的所有数据
                queryItemTable(conn);
                // 查询StorekeeperWarehouse表的所有数据
                queryStorekeeperWarehouseTable(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // 关闭数据库连接
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        // 查询Warehouse表的所有数据
        private static void queryWarehouseTable(Connection conn) throws SQLException {
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM Warehouse";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int warehouseId = rs.getInt("warehouse_id");
                String warehouseName = rs.getString("warehouse_name");

                System.out.println("Warehouse ID: " + warehouseId);
                System.out.println("Warehouse Name: " + warehouseName);
                System.out.println("---------------------------");
            }

            rs.close();
            stmt.close();
        }

        // 查询Storekeeper表的所有数据
        private static void queryStorekeeperTable(Connection conn) throws SQLException {
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM Storekeeper";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int storekeeperId = rs.getInt("storekeeper_id");
                String storekeeperName = rs.getString("storekeeper_name");

                System.out.println("Storekeeper ID: " + storekeeperId);
                System.out.println("Storekeeper Name: " + storekeeperName);
                System.out.println("---------------------------");
            }

            rs.close();
            stmt.close();
        }

        // 查询WarehouseItem表的所有数据
        private static void queryWarehouseItemTable(Connection conn) throws SQLException {
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM WarehouseItem";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int warehouseItemId = rs.getInt("warehouse_item_id");
                int warehouseId = rs.getInt("warehouse_id");
                int itemId = rs.getInt("item_id");

                System.out.println("Warehouse Item ID: " + warehouseItemId);
                System.out.println("Warehouse ID: " + warehouseId);
                System.out.println("Item ID: " + itemId);
                System.out.println("---------------------------");
            }

            rs.close();
            stmt.close();
        }

        // 查询Item表的所有数据
        private static void queryItemTable(Connection conn) throws SQLException {
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM Item";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int itemId = rs.getInt("item_id");
                String itemName = rs.getString("item_name");

                System.out.println("Item ID: " + itemId);
                System.out.println("Item Name: " + itemName);
                System.out.println("---------------------------");
            }

            rs.close();
            stmt.close();
        }

        // 查询StorekeeperWarehouse表的所有数据
        private static void queryStorekeeperWarehouseTable(Connection conn) throws SQLException {
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM StorekeeperWarehouse";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int storekeeperWarehouseId = rs.getInt("storekeeper_warehouse_id");
                int warehouseId = rs.getInt("warehouse_id");
                int storekeeperId = rs.getInt("storekeeper_id");

                System.out.println("Storekeeper Warehouse ID: " + storekeeperWarehouseId);
                System.out.println("Warehouse ID: " + warehouseId);
                System.out.println("Storekeeper ID: " + storekeeperId);
                System.out.println("---------------------------");
            }

            rs.close();
            stmt.close();
        }
    }
    // 查询Warehouse表的所有数据
    private static void queryWarehouseTable(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM Warehouse";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int warehouseId = rs.getInt("warehouse_id");
            String warehouseName = rs.getString("warehouse_name");

            System.out.println("Warehouse ID: " + warehouseId);
            System.out.println("Warehouse Name: " + warehouseName);
            System.out.println("---------------------------");
        }

        rs.close();
        stmt.close();
    }


}
