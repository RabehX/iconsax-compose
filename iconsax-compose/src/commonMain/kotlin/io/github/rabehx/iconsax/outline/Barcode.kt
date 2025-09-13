/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Barcode: ImageVector
    get() {
        if (_Barcode != null) {
            return _Barcode!!
        }
        _Barcode = ImageVector.Builder(
            name = "Outline.Barcode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 21.25f)
                horizontalLineTo(7f)
                curveTo(3.35f, 21.25f, 1.25f, 19.15f, 1.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(1.25f, 4.85f, 3.35f, 2.75f, 7f, 2.75f)
                horizontalLineTo(17f)
                curveTo(20.65f, 2.75f, 22.75f, 4.85f, 22.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22.75f, 19.15f, 20.65f, 21.25f, 17f, 21.25f)
                close()
                moveTo(7f, 4.25f)
                curveTo(4.14f, 4.25f, 2.75f, 5.64f, 2.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2.75f, 18.36f, 4.14f, 19.75f, 7f, 19.75f)
                horizontalLineTo(17f)
                curveTo(19.86f, 19.75f, 21.25f, 18.36f, 21.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(21.25f, 5.64f, 19.86f, 4.25f, 17f, 4.25f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 16.75f)
                curveTo(5.59f, 16.75f, 5.25f, 16.41f, 5.25f, 16f)
                verticalLineTo(8f)
                curveTo(5.25f, 7.59f, 5.59f, 7.25f, 6f, 7.25f)
                curveTo(6.41f, 7.25f, 6.75f, 7.59f, 6.75f, 8f)
                verticalLineTo(16f)
                curveTo(6.75f, 16.41f, 6.41f, 16.75f, 6f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 12.75f)
                curveTo(8.59f, 12.75f, 8.25f, 12.41f, 8.25f, 12f)
                verticalLineTo(8f)
                curveTo(8.25f, 7.59f, 8.59f, 7.25f, 9f, 7.25f)
                curveTo(9.41f, 7.25f, 9.75f, 7.59f, 9.75f, 8f)
                verticalLineTo(12f)
                curveTo(9.75f, 12.41f, 9.41f, 12.75f, 9f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 16.75f)
                curveTo(8.59f, 16.75f, 8.25f, 16.41f, 8.25f, 16f)
                verticalLineTo(15f)
                curveTo(8.25f, 14.59f, 8.59f, 14.25f, 9f, 14.25f)
                curveTo(9.41f, 14.25f, 9.75f, 14.59f, 9.75f, 15f)
                verticalLineTo(16f)
                curveTo(9.75f, 16.41f, 9.41f, 16.75f, 9f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 9.75f)
                curveTo(14.59f, 9.75f, 14.25f, 9.41f, 14.25f, 9f)
                verticalLineTo(8f)
                curveTo(14.25f, 7.59f, 14.59f, 7.25f, 15f, 7.25f)
                curveTo(15.41f, 7.25f, 15.75f, 7.59f, 15.75f, 8f)
                verticalLineTo(9f)
                curveTo(15.75f, 9.41f, 15.41f, 9.75f, 15f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.75f)
                curveTo(11.59f, 16.75f, 11.25f, 16.41f, 11.25f, 16f)
                verticalLineTo(8f)
                curveTo(11.25f, 7.59f, 11.59f, 7.25f, 12f, 7.25f)
                curveTo(12.41f, 7.25f, 12.75f, 7.59f, 12.75f, 8f)
                verticalLineTo(16f)
                curveTo(12.75f, 16.41f, 12.41f, 16.75f, 12f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 16.75f)
                curveTo(14.59f, 16.75f, 14.25f, 16.41f, 14.25f, 16f)
                verticalLineTo(12f)
                curveTo(14.25f, 11.59f, 14.59f, 11.25f, 15f, 11.25f)
                curveTo(15.41f, 11.25f, 15.75f, 11.59f, 15.75f, 12f)
                verticalLineTo(16f)
                curveTo(15.75f, 16.41f, 15.41f, 16.75f, 15f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 16.75f)
                curveTo(17.59f, 16.75f, 17.25f, 16.41f, 17.25f, 16f)
                verticalLineTo(8f)
                curveTo(17.25f, 7.59f, 17.59f, 7.25f, 18f, 7.25f)
                curveTo(18.41f, 7.25f, 18.75f, 7.59f, 18.75f, 8f)
                verticalLineTo(16f)
                curveTo(18.75f, 16.41f, 18.41f, 16.75f, 18f, 16.75f)
                close()
            }
        }.build()

        return _Barcode!!
    }

@Suppress("ObjectPropertyName")
private var _Barcode: ImageVector? = null
