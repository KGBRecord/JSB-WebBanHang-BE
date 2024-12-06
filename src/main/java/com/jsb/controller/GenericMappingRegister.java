package com.jsb.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.jsb.constant.ResourceName;
import com.jsb.constant.SearchFields;
import com.jsb.dto.address.AddressRequest;
import com.jsb.dto.address.AddressResponse;
import com.jsb.dto.address.DistrictRequest;
import com.jsb.dto.address.DistrictResponse;
import com.jsb.dto.address.ProvinceRequest;
import com.jsb.dto.address.ProvinceResponse;
import com.jsb.dto.address.WardRequest;
import com.jsb.dto.address.WardResponse;
import com.jsb.dto.authentication.RoleRequest;
import com.jsb.dto.authentication.RoleResponse;
import com.jsb.dto.authentication.UserRequest;
import com.jsb.dto.authentication.UserResponse;
import com.jsb.dto.cashbook.PaymentMethodRequest;
import com.jsb.dto.cashbook.PaymentMethodResponse;
import com.jsb.dto.chat.RoomRequest;
import com.jsb.dto.chat.RoomResponse;
import com.jsb.dto.customer.CustomerGroupRequest;
import com.jsb.dto.customer.CustomerGroupResponse;
import com.jsb.dto.customer.CustomerRequest;
import com.jsb.dto.customer.CustomerResourceRequest;
import com.jsb.dto.customer.CustomerResourceResponse;
import com.jsb.dto.customer.CustomerResponse;
import com.jsb.dto.customer.CustomerStatusRequest;
import com.jsb.dto.customer.CustomerStatusResponse;
import com.jsb.dto.employee.DepartmentRequest;
import com.jsb.dto.employee.DepartmentResponse;
import com.jsb.dto.employee.EmployeeRequest;
import com.jsb.dto.employee.EmployeeResponse;
import com.jsb.dto.employee.JobLevelRequest;
import com.jsb.dto.employee.JobLevelResponse;
import com.jsb.dto.employee.JobTitleRequest;
import com.jsb.dto.employee.JobTitleResponse;
import com.jsb.dto.employee.JobTypeRequest;
import com.jsb.dto.employee.JobTypeResponse;
import com.jsb.dto.employee.OfficeRequest;
import com.jsb.dto.employee.OfficeResponse;
import com.jsb.dto.general.ImageRequest;
import com.jsb.dto.general.ImageResponse;
import com.jsb.dto.inventory.CountRequest;
import com.jsb.dto.inventory.CountResponse;
import com.jsb.dto.inventory.DestinationRequest;
import com.jsb.dto.inventory.DestinationResponse;
import com.jsb.dto.inventory.DocketReasonRequest;
import com.jsb.dto.inventory.DocketReasonResponse;
import com.jsb.dto.inventory.DocketRequest;
import com.jsb.dto.inventory.DocketResponse;
import com.jsb.dto.inventory.ProductInventoryLimitRequest;
import com.jsb.dto.inventory.ProductInventoryLimitResponse;
import com.jsb.dto.inventory.PurchaseOrderRequest;
import com.jsb.dto.inventory.PurchaseOrderResponse;
import com.jsb.dto.inventory.StorageLocationRequest;
import com.jsb.dto.inventory.StorageLocationResponse;
import com.jsb.dto.inventory.TransferRequest;
import com.jsb.dto.inventory.TransferResponse;
import com.jsb.dto.inventory.VariantInventoryLimitRequest;
import com.jsb.dto.inventory.VariantInventoryLimitResponse;
import com.jsb.dto.inventory.WarehouseRequest;
import com.jsb.dto.inventory.WarehouseResponse;
import com.jsb.dto.order.OrderCancellationReasonRequest;
import com.jsb.dto.order.OrderCancellationReasonResponse;
import com.jsb.dto.order.OrderRequest;
import com.jsb.dto.order.OrderResourceRequest;
import com.jsb.dto.order.OrderResourceResponse;
import com.jsb.dto.order.OrderResponse;
import com.jsb.dto.product.BrandRequest;
import com.jsb.dto.product.BrandResponse;
import com.jsb.dto.product.CategoryRequest;
import com.jsb.dto.product.CategoryResponse;
import com.jsb.dto.product.GuaranteeRequest;
import com.jsb.dto.product.GuaranteeResponse;
import com.jsb.dto.product.ProductRequest;
import com.jsb.dto.product.ProductResponse;
import com.jsb.dto.product.PropertyRequest;
import com.jsb.dto.product.PropertyResponse;
import com.jsb.dto.product.SpecificationRequest;
import com.jsb.dto.product.SpecificationResponse;
import com.jsb.dto.product.SupplierRequest;
import com.jsb.dto.product.SupplierResponse;
import com.jsb.dto.product.TagRequest;
import com.jsb.dto.product.TagResponse;
import com.jsb.dto.product.UnitRequest;
import com.jsb.dto.product.UnitResponse;
import com.jsb.dto.product.VariantRequest;
import com.jsb.dto.product.VariantResponse;
import com.jsb.dto.promotion.PromotionRequest;
import com.jsb.dto.promotion.PromotionResponse;
import com.jsb.dto.review.ReviewRequest;
import com.jsb.dto.review.ReviewResponse;
import com.jsb.dto.reward.RewardStrategyRequest;
import com.jsb.dto.reward.RewardStrategyResponse;
import com.jsb.dto.waybill.WaybillRequest;
import com.jsb.dto.waybill.WaybillResponse;
import com.jsb.entity.address.Address;
import com.jsb.entity.address.District;
import com.jsb.entity.address.Ward;
import com.jsb.entity.authentication.Role;
import com.jsb.entity.authentication.User;
import com.jsb.entity.cashbook.PaymentMethod;
import com.jsb.entity.chat.Room;
import com.jsb.entity.customer.Customer;
import com.jsb.entity.customer.CustomerGroup;
import com.jsb.entity.customer.CustomerResource;
import com.jsb.entity.customer.CustomerStatus;
import com.jsb.entity.employee.Department;
import com.jsb.entity.employee.Employee;
import com.jsb.entity.employee.JobLevel;
import com.jsb.entity.employee.JobTitle;
import com.jsb.entity.employee.JobType;
import com.jsb.entity.employee.Office;
import com.jsb.entity.general.Image;
import com.jsb.entity.inventory.Count;
import com.jsb.entity.inventory.Destination;
import com.jsb.entity.inventory.DocketReason;
import com.jsb.entity.inventory.ProductInventoryLimit;
import com.jsb.entity.inventory.PurchaseOrder;
import com.jsb.entity.inventory.StorageLocation;
import com.jsb.entity.inventory.Transfer;
import com.jsb.entity.inventory.VariantInventoryLimit;
import com.jsb.entity.inventory.Warehouse;
import com.jsb.entity.order.Order;
import com.jsb.entity.order.OrderCancellationReason;
import com.jsb.entity.order.OrderResource;
import com.jsb.entity.product.Brand;
import com.jsb.entity.product.Category;
import com.jsb.entity.product.Guarantee;
import com.jsb.entity.product.Product;
import com.jsb.entity.product.Property;
import com.jsb.entity.product.Specification;
import com.jsb.entity.product.Supplier;
import com.jsb.entity.product.Tag;
import com.jsb.entity.product.Unit;
import com.jsb.entity.product.Variant;
import com.jsb.entity.reward.RewardStrategy;
import com.jsb.mapper.address.AddressMapper;
import com.jsb.mapper.address.DistrictMapper;
import com.jsb.mapper.address.WardMapper;
import com.jsb.mapper.authentication.RoleMapper;
import com.jsb.mapper.authentication.UserMapper;
import com.jsb.mapper.cashbook.PaymentMethodMapper;
import com.jsb.mapper.chat.RoomMapper;
import com.jsb.mapper.customer.CustomerGroupMapper;
import com.jsb.mapper.customer.CustomerMapper;
import com.jsb.mapper.customer.CustomerResourceMapper;
import com.jsb.mapper.customer.CustomerStatusMapper;
import com.jsb.mapper.employee.DepartmentMapper;
import com.jsb.mapper.employee.EmployeeMapper;
import com.jsb.mapper.employee.JobLevelMapper;
import com.jsb.mapper.employee.JobTitleMapper;
import com.jsb.mapper.employee.JobTypeMapper;
import com.jsb.mapper.employee.OfficeMapper;
import com.jsb.mapper.general.ImageMapper;
import com.jsb.mapper.inventory.CountMapper;
import com.jsb.mapper.inventory.DestinationMapper;
import com.jsb.mapper.inventory.DocketReasonMapper;
import com.jsb.mapper.inventory.ProductInventoryLimitMapper;
import com.jsb.mapper.inventory.PurchaseOrderMapper;
import com.jsb.mapper.inventory.StorageLocationMapper;
import com.jsb.mapper.inventory.TransferMapper;
import com.jsb.mapper.inventory.VariantInventoryLimitMapper;
import com.jsb.mapper.inventory.WarehouseMapper;
import com.jsb.mapper.order.OrderCancellationReasonMapper;
import com.jsb.mapper.order.OrderMapper;
import com.jsb.mapper.order.OrderResourceMapper;
import com.jsb.mapper.product.BrandMapper;
import com.jsb.mapper.product.CategoryMapper;
import com.jsb.mapper.product.GuaranteeMapper;
import com.jsb.mapper.product.ProductMapper;
import com.jsb.mapper.product.PropertyMapper;
import com.jsb.mapper.product.SpecificationMapper;
import com.jsb.mapper.product.SupplierMapper;
import com.jsb.mapper.product.TagMapper;
import com.jsb.mapper.product.UnitMapper;
import com.jsb.mapper.product.VariantMapper;
import com.jsb.mapper.reward.RewardStrategyMapper;
import com.jsb.repository.address.AddressRepository;
import com.jsb.repository.address.DistrictRepository;
import com.jsb.repository.address.WardRepository;
import com.jsb.repository.authentication.RoleRepository;
import com.jsb.repository.authentication.UserRepository;
import com.jsb.repository.cashbook.PaymentMethodRepository;
import com.jsb.repository.chat.RoomRepository;
import com.jsb.repository.customer.CustomerGroupRepository;
import com.jsb.repository.customer.CustomerRepository;
import com.jsb.repository.customer.CustomerResourceRepository;
import com.jsb.repository.customer.CustomerStatusRepository;
import com.jsb.repository.employee.DepartmentRepository;
import com.jsb.repository.employee.EmployeeRepository;
import com.jsb.repository.employee.JobLevelRepository;
import com.jsb.repository.employee.JobTitleRepository;
import com.jsb.repository.employee.JobTypeRepository;
import com.jsb.repository.employee.OfficeRepository;
import com.jsb.repository.general.ImageRepository;
import com.jsb.repository.inventory.CountRepository;
import com.jsb.repository.inventory.DestinationRepository;
import com.jsb.repository.inventory.DocketReasonRepository;
import com.jsb.repository.inventory.ProductInventoryLimitRepository;
import com.jsb.repository.inventory.PurchaseOrderRepository;
import com.jsb.repository.inventory.StorageLocationRepository;
import com.jsb.repository.inventory.TransferRepository;
import com.jsb.repository.inventory.VariantInventoryLimitRepository;
import com.jsb.repository.inventory.WarehouseRepository;
import com.jsb.repository.order.OrderCancellationReasonRepository;
import com.jsb.repository.order.OrderRepository;
import com.jsb.repository.order.OrderResourceRepository;
import com.jsb.repository.product.BrandRepository;
import com.jsb.repository.product.CategoryRepository;
import com.jsb.repository.product.GuaranteeRepository;
import com.jsb.repository.product.ProductRepository;
import com.jsb.repository.product.PropertyRepository;
import com.jsb.repository.product.SpecificationRepository;
import com.jsb.repository.product.SupplierRepository;
import com.jsb.repository.product.TagRepository;
import com.jsb.repository.product.UnitRepository;
import com.jsb.repository.product.VariantRepository;
import com.jsb.repository.reward.RewardStrategyRepository;
import com.jsb.service.CrudService;
import com.jsb.service.GenericService;
import com.jsb.service.address.ProvinceService;
import com.jsb.service.inventory.DocketService;
import com.jsb.service.promotion.PromotionService;
import com.jsb.service.review.ReviewService;
import com.jsb.service.waybill.WaybillService;

import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.util.pattern.PathPatternParser;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@AllArgsConstructor
public class GenericMappingRegister {

    private ApplicationContext context;
    private RequestMappingHandlerMapping handlerMapping;

    // Controllers
    private GenericController<ProvinceRequest, ProvinceResponse> provinceController;
    private GenericController<DistrictRequest, DistrictResponse> districtController;
    private GenericController<WardRequest, WardResponse> wardController;
    private GenericController<AddressRequest, AddressResponse> addressController;
    private GenericController<UserRequest, UserResponse> userController;
    private GenericController<RoleRequest, RoleResponse> roleController;
    private GenericController<OfficeRequest, OfficeResponse> officeController;
    private GenericController<DepartmentRequest, DepartmentResponse> departmentController;
    private GenericController<JobLevelRequest, JobLevelResponse> jobLevelController;
    private GenericController<JobTypeRequest, JobTypeResponse> jobTypeController;
    private GenericController<JobTitleRequest, JobTitleResponse> jobTitleController;
    private GenericController<EmployeeRequest, EmployeeResponse> employeeController;
    private GenericController<CustomerGroupRequest, CustomerGroupResponse> customerGroupController;
    private GenericController<CustomerResourceRequest, CustomerResourceResponse> customerResourceController;
    private GenericController<CustomerStatusRequest, CustomerStatusResponse> customerStatusController;
    private GenericController<CustomerRequest, CustomerResponse> customerController;
    private GenericController<PropertyRequest, PropertyResponse> propertyController;
    private GenericController<CategoryRequest, CategoryResponse> categoryController;
    private GenericController<TagRequest, TagResponse> tagController;
    private GenericController<GuaranteeRequest, GuaranteeResponse> guaranteeController;
    private GenericController<UnitRequest, UnitResponse> unitController;
    private GenericController<SupplierRequest, SupplierResponse> supplierController;
    private GenericController<BrandRequest, BrandResponse> brandController;
    private GenericController<SpecificationRequest, SpecificationResponse> specificationController;
    private GenericController<ProductRequest, ProductResponse> productController;
    private GenericController<VariantRequest, VariantResponse> variantController;
    private GenericController<ImageRequest, ImageResponse> imageController;
    private GenericController<ProductInventoryLimitRequest, ProductInventoryLimitResponse> productInventoryLimitController;
    private GenericController<VariantInventoryLimitRequest, VariantInventoryLimitResponse> variantInventoryLimitController;
    private GenericController<WarehouseRequest, WarehouseResponse> warehouseController;
    private GenericController<CountRequest, CountResponse> countController;
    private GenericController<DestinationRequest, DestinationResponse> destinationController;
    private GenericController<DocketReasonRequest, DocketReasonResponse> docketReasonController;
    private GenericController<TransferRequest, TransferResponse> transferController;
    private GenericController<DocketRequest, DocketResponse> docketController;
    private GenericController<StorageLocationRequest, StorageLocationResponse> storageLocationController;
    private GenericController<PurchaseOrderRequest, PurchaseOrderResponse> purchaseOrderController;
    private GenericController<OrderResourceRequest, OrderResourceResponse> orderResourceController;
    private GenericController<OrderCancellationReasonRequest, OrderCancellationReasonResponse> orderCancellationReasonController;
    private GenericController<OrderRequest, OrderResponse> orderController;
    private GenericController<WaybillRequest, WaybillResponse> waybillController;
    private GenericController<ReviewRequest, ReviewResponse> reviewController;
    private GenericController<PaymentMethodRequest, PaymentMethodResponse> paymentMethodController;
    private GenericController<PromotionRequest, PromotionResponse> promotionController;
    private GenericController<RoomRequest, RoomResponse> roomController;
    private GenericController<RewardStrategyRequest, RewardStrategyResponse> rewardStrategyController;

    // Services
    private GenericService<District, DistrictRequest, DistrictResponse> districtService;
    private GenericService<Ward, WardRequest, WardResponse> wardService;
    private GenericService<Address, AddressRequest, AddressResponse> addressService;
    private GenericService<User, UserRequest, UserResponse> userService;
    private GenericService<Role, RoleRequest, RoleResponse> roleService;
    private GenericService<Office, OfficeRequest, OfficeResponse> officeService;
    private GenericService<Department, DepartmentRequest, DepartmentResponse> departmentService;
    private GenericService<JobLevel, JobLevelRequest, JobLevelResponse> jobLevelService;
    private GenericService<JobType, JobTypeRequest, JobTypeResponse> jobTypeService;
    private GenericService<JobTitle, JobTitleRequest, JobTitleResponse> jobTitleService;
    private GenericService<Employee, EmployeeRequest, EmployeeResponse> employeeService;
    private GenericService<CustomerGroup, CustomerGroupRequest, CustomerGroupResponse> customerGroupService;
    private GenericService<CustomerResource, CustomerResourceRequest, CustomerResourceResponse> customerResourceService;
    private GenericService<CustomerStatus, CustomerStatusRequest, CustomerStatusResponse> customerStatusService;
    private GenericService<Customer, CustomerRequest, CustomerResponse> customerService;
    private GenericService<Property, PropertyRequest, PropertyResponse> propertyService;
    private GenericService<Category, CategoryRequest, CategoryResponse> categoryService;
    private GenericService<Tag, TagRequest, TagResponse> tagService;
    private GenericService<Guarantee, GuaranteeRequest, GuaranteeResponse> guaranteeService;
    private GenericService<Unit, UnitRequest, UnitResponse> unitService;
    private GenericService<Supplier, SupplierRequest, SupplierResponse> supplierService;
    private GenericService<Brand, BrandRequest, BrandResponse> brandService;
    private GenericService<Specification, SpecificationRequest, SpecificationResponse> specificationService;
    private GenericService<Product, ProductRequest, ProductResponse> productService;
    private GenericService<Variant, VariantRequest, VariantResponse> variantService;
    private GenericService<Image, ImageRequest, ImageResponse> imageService;
    private GenericService<ProductInventoryLimit, ProductInventoryLimitRequest, ProductInventoryLimitResponse> productInventoryLimitService;
    private GenericService<VariantInventoryLimit, VariantInventoryLimitRequest, VariantInventoryLimitResponse> variantInventoryLimitService;
    private GenericService<Warehouse, WarehouseRequest, WarehouseResponse> warehouseService;
    private GenericService<Count, CountRequest, CountResponse> countService;
    private GenericService<Destination, DestinationRequest, DestinationResponse> destinationService;
    private GenericService<DocketReason, DocketReasonRequest, DocketReasonResponse> docketReasonService;
    private GenericService<Transfer, TransferRequest, TransferResponse> transferService;
    private GenericService<StorageLocation, StorageLocationRequest, StorageLocationResponse> storageLocationService;
    private GenericService<PurchaseOrder, PurchaseOrderRequest, PurchaseOrderResponse> purchaseOrderService;
    private GenericService<OrderResource, OrderResourceRequest, OrderResourceResponse> orderResourceService;
    private GenericService<OrderCancellationReason, OrderCancellationReasonRequest, OrderCancellationReasonResponse> orderCancellationReasonService;
    private GenericService<Order, OrderRequest, OrderResponse> orderService;
    private GenericService<PaymentMethod, PaymentMethodRequest, PaymentMethodResponse> paymentMethodService;
    private GenericService<Room, RoomRequest, RoomResponse> roomService;
    private GenericService<RewardStrategy, RewardStrategyRequest, RewardStrategyResponse> rewardStrategyService;

    @PostConstruct
    public void registerControllers() throws NoSuchMethodException {

        register("provinces", provinceController, context.getBean(ProvinceService.class), ProvinceRequest.class);

        register("districts", districtController, districtService.init(
                context.getBean(DistrictRepository.class),
                context.getBean(DistrictMapper.class),
                SearchFields.DISTRICT,
                ResourceName.DISTRICT
        ), DistrictRequest.class);

        register("wards", wardController, wardService.init(
                context.getBean(WardRepository.class),
                context.getBean(WardMapper.class),
                SearchFields.WARD,
                ResourceName.WARD
        ), WardRequest.class);

        register("addresses", addressController, addressService.init(
                context.getBean(AddressRepository.class),
                context.getBean(AddressMapper.class),
                SearchFields.ADDRESS,
                ResourceName.ADDRESS
        ), AddressRequest.class);

        register("users", userController, userService.init(
                context.getBean(UserRepository.class),
                context.getBean(UserMapper.class),
                SearchFields.USER,
                ResourceName.USER
        ), UserRequest.class);

        register("roles", roleController, roleService.init(
                context.getBean(RoleRepository.class),
                context.getBean(RoleMapper.class),
                SearchFields.ROLE,
                ResourceName.ROLE
        ), RoleRequest.class);

        register("offices", officeController, officeService.init(
                context.getBean(OfficeRepository.class),
                context.getBean(OfficeMapper.class),
                SearchFields.OFFICE,
                ResourceName.OFFICE
        ), OfficeRequest.class);

        register("departments", departmentController, departmentService.init(
                context.getBean(DepartmentRepository.class),
                context.getBean(DepartmentMapper.class),
                SearchFields.DEPARTMENT,
                ResourceName.DEPARTMENT
        ), DepartmentRequest.class);

        register("job-levels", jobLevelController, jobLevelService.init(
                context.getBean(JobLevelRepository.class),
                context.getBean(JobLevelMapper.class),
                SearchFields.JOB_LEVEL,
                ResourceName.JOB_LEVEL
        ), JobLevelRequest.class);

        register("job-titles", jobTitleController, jobTitleService.init(
                context.getBean(JobTitleRepository.class),
                context.getBean(JobTitleMapper.class),
                SearchFields.JOB_TITLE,
                ResourceName.JOB_TITLE
        ), JobTitleRequest.class);

        register("job-types", jobTypeController, jobTypeService.init(
                context.getBean(JobTypeRepository.class),
                context.getBean(JobTypeMapper.class),
                SearchFields.JOB_TYPE,
                ResourceName.JOB_TYPE
        ), JobTypeRequest.class);

        register("employees", employeeController, employeeService.init(
                context.getBean(EmployeeRepository.class),
                context.getBean(EmployeeMapper.class),
                SearchFields.EMPLOYEE,
                ResourceName.EMPLOYEE
        ), EmployeeRequest.class);

        register("customer-groups", customerGroupController, customerGroupService.init(
                context.getBean(CustomerGroupRepository.class),
                context.getBean(CustomerGroupMapper.class),
                SearchFields.CUSTOMER_GROUP,
                ResourceName.CUSTOMER_GROUP
        ), CustomerGroupRequest.class);

        register("customer-resources", customerResourceController, customerResourceService.init(
                context.getBean(CustomerResourceRepository.class),
                context.getBean(CustomerResourceMapper.class),
                SearchFields.CUSTOMER_RESOURCE,
                ResourceName.CUSTOMER_RESOURCE
        ), CustomerResourceRequest.class);

        register("customer-status", customerStatusController, customerStatusService.init(
                context.getBean(CustomerStatusRepository.class),
                context.getBean(CustomerStatusMapper.class),
                SearchFields.CUSTOMER_STATUS,
                ResourceName.CUSTOMER_STATUS
        ), CustomerStatusRequest.class);

        register("customers", customerController, customerService.init(
                context.getBean(CustomerRepository.class),
                context.getBean(CustomerMapper.class),
                SearchFields.CUSTOMER,
                ResourceName.CUSTOMER
        ), CustomerRequest.class);

        register("properties", propertyController, propertyService.init(
                context.getBean(PropertyRepository.class),
                context.getBean(PropertyMapper.class),
                SearchFields.PROPERTY,
                ResourceName.PROPERTY
        ), PropertyRequest.class);

        register("categories", categoryController, categoryService.init(
                context.getBean(CategoryRepository.class),
                context.getBean(CategoryMapper.class),
                SearchFields.CATEGORY,
                ResourceName.CATEGORY
        ), CategoryRequest.class);

        register("tags", tagController, tagService.init(
                context.getBean(TagRepository.class),
                context.getBean(TagMapper.class),
                SearchFields.TAG,
                ResourceName.TAG
        ), TagRequest.class);

        register("guarantees", guaranteeController, guaranteeService.init(
                context.getBean(GuaranteeRepository.class),
                context.getBean(GuaranteeMapper.class),
                SearchFields.GUARANTEE,
                ResourceName.GUARANTEE
        ), GuaranteeRequest.class);

        register("units", unitController, unitService.init(
                context.getBean(UnitRepository.class),
                context.getBean(UnitMapper.class),
                SearchFields.UNIT,
                ResourceName.UNIT
        ), UnitRequest.class);

        register("suppliers", supplierController, supplierService.init(
                context.getBean(SupplierRepository.class),
                context.getBean(SupplierMapper.class),
                SearchFields.SUPPLIER,
                ResourceName.SUPPLIER
        ), SupplierRequest.class);

        register("brands", brandController, brandService.init(
                context.getBean(BrandRepository.class),
                context.getBean(BrandMapper.class),
                SearchFields.BRAND,
                ResourceName.BRAND
        ), BrandRequest.class);

        register("specifications", specificationController, specificationService.init(
                context.getBean(SpecificationRepository.class),
                context.getBean(SpecificationMapper.class),
                SearchFields.SPECIFICATION,
                ResourceName.SPECIFICATION
        ), SpecificationRequest.class);

        register("products", productController, productService.init(
                context.getBean(ProductRepository.class),
                context.getBean(ProductMapper.class),
                SearchFields.PRODUCT,
                ResourceName.PRODUCT
        ), ProductRequest.class);

        register("variants", variantController, variantService.init(
                context.getBean(VariantRepository.class),
                context.getBean(VariantMapper.class),
                SearchFields.VARIANT,
                ResourceName.VARIANT
        ), VariantRequest.class);

        register("images", imageController, imageService.init(
                context.getBean(ImageRepository.class),
                context.getBean(ImageMapper.class),
                SearchFields.IMAGE,
                ResourceName.IMAGE
        ), ImageRequest.class);

        register("product-inventory-limits", productInventoryLimitController, productInventoryLimitService.init(
                context.getBean(ProductInventoryLimitRepository.class),
                context.getBean(ProductInventoryLimitMapper.class),
                SearchFields.PRODUCT_INVENTORY_LIMIT,
                ResourceName.PRODUCT_INVENTORY_LIMIT
        ), ProductInventoryLimitRequest.class);

        register("variant-inventory-limits", variantInventoryLimitController, variantInventoryLimitService.init(
                context.getBean(VariantInventoryLimitRepository.class),
                context.getBean(VariantInventoryLimitMapper.class),
                SearchFields.VARIANT_INVENTORY_LIMIT,
                ResourceName.VARIANT_INVENTORY_LIMIT
        ), VariantInventoryLimitRequest.class);

        register("warehouses", warehouseController, warehouseService.init(
                context.getBean(WarehouseRepository.class),
                context.getBean(WarehouseMapper.class),
                SearchFields.WAREHOUSE,
                ResourceName.WAREHOUSE
        ), WarehouseRequest.class);

        register("counts", countController, countService.init(
                context.getBean(CountRepository.class),
                context.getBean(CountMapper.class),
                SearchFields.COUNT,
                ResourceName.COUNT
        ), CountRequest.class);

        register("destinations", destinationController, destinationService.init(
                context.getBean(DestinationRepository.class),
                context.getBean(DestinationMapper.class),
                SearchFields.DESTINATION,
                ResourceName.DESTINATION
        ), DestinationRequest.class);

        register("docket-reasons", docketReasonController, docketReasonService.init(
                context.getBean(DocketReasonRepository.class),
                context.getBean(DocketReasonMapper.class),
                SearchFields.DOCKET_REASON,
                ResourceName.DOCKET_REASON
        ), DocketReasonRequest.class);

        register("transfers", transferController, transferService.init(
                context.getBean(TransferRepository.class),
                context.getBean(TransferMapper.class),
                SearchFields.TRANSFER,
                ResourceName.TRANSFER
        ), TransferRequest.class);

        register("dockets", docketController, context.getBean(DocketService.class), DocketRequest.class);

        register("storage-locations", storageLocationController, storageLocationService.init(
                context.getBean(StorageLocationRepository.class),
                context.getBean(StorageLocationMapper.class),
                SearchFields.STORAGE_LOCATION,
                ResourceName.STORAGE_LOCATION
        ), StorageLocationRequest.class);

        register("purchase-orders", purchaseOrderController, purchaseOrderService.init(
                context.getBean(PurchaseOrderRepository.class),
                context.getBean(PurchaseOrderMapper.class),
                SearchFields.PURCHASE_ORDER,
                ResourceName.PURCHASE_ORDER
        ), PurchaseOrderRequest.class);

        register("order-resources", orderResourceController, orderResourceService.init(
                context.getBean(OrderResourceRepository.class),
                context.getBean(OrderResourceMapper.class),
                SearchFields.ORDER_RESOURCE,
                ResourceName.ORDER_RESOURCE
        ), OrderResourceRequest.class);

        register("order-cancellation-reasons", orderCancellationReasonController, orderCancellationReasonService.init(
                context.getBean(OrderCancellationReasonRepository.class),
                context.getBean(OrderCancellationReasonMapper.class),
                SearchFields.ORDER_CANCELLATION_REASON,
                ResourceName.ORDER_CANCELLATION_REASON
        ), OrderCancellationReasonRequest.class);

        register("orders", orderController, orderService.init(
                context.getBean(OrderRepository.class),
                context.getBean(OrderMapper.class),
                SearchFields.ORDER,
                ResourceName.ORDER
        ), OrderRequest.class);

        register("waybills", waybillController, context.getBean(WaybillService.class), WaybillRequest.class);

        register("reviews", reviewController, context.getBean(ReviewService.class), ReviewRequest.class);

        register("payment-methods", paymentMethodController, paymentMethodService.init(
                context.getBean(PaymentMethodRepository.class),
                context.getBean(PaymentMethodMapper.class),
                SearchFields.PAYMENT_METHOD,
                ResourceName.PAYMENT_METHOD
        ), PaymentMethodRequest.class);

        register("promotions", promotionController, context.getBean(PromotionService.class), PromotionRequest.class);

        register("rooms", roomController, roomService.init(
                context.getBean(RoomRepository.class),
                context.getBean(RoomMapper.class),
                SearchFields.ROOM,
                ResourceName.ROOM
        ), RoomRequest.class);

        register("reward-strategies", rewardStrategyController, rewardStrategyService.init(
                context.getBean(RewardStrategyRepository.class),
                context.getBean(RewardStrategyMapper.class),
                SearchFields.REWARD_STRATEGY,
                ResourceName.REWARD_STRATEGY
        ), RewardStrategyRequest.class);

    }

    private <I, O> void register(String resource,
                                 GenericController<I, O> controller,
                                 CrudService<Long, I, O> service,
                                 Class<I> requestType
    ) throws NoSuchMethodException {
        RequestMappingInfo.BuilderConfiguration options = new RequestMappingInfo.BuilderConfiguration();
        options.setPatternParser(new PathPatternParser());

        controller.setCrudService(service);
        controller.setRequestType(requestType);

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource)
                        .methods(RequestMethod.GET)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("getAllResources", int.class, int.class,
                        String.class, String.class, String.class, boolean.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource + "/{id}")
                        .methods(RequestMethod.GET)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("getResource", Long.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource)
                        .methods(RequestMethod.POST)
                        .consumes(MediaType.APPLICATION_JSON_VALUE)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("createResource", JsonNode.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource + "/{id}")
                        .methods(RequestMethod.PUT)
                        .consumes(MediaType.APPLICATION_JSON_VALUE)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("updateResource", Long.class, JsonNode.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource + "/{id}")
                        .methods(RequestMethod.DELETE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("deleteResource", Long.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource)
                        .methods(RequestMethod.DELETE)
                        .consumes(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("deleteResources", List.class)
        );
    }

}
