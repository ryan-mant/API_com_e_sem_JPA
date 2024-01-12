import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletarMetroComponent } from './deletar-metro.component';

describe('DeletarMetroComponent', () => {
  let component: DeletarMetroComponent;
  let fixture: ComponentFixture<DeletarMetroComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeletarMetroComponent]
    });
    fixture = TestBed.createComponent(DeletarMetroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
