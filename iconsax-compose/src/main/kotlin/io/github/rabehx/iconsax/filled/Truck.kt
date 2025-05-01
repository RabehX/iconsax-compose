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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.Truck: ImageVector
    get() {
        if (_Truck != null) {
            return _Truck!!
        }
        _Truck = ImageVector.Builder(
            name = "Filled.Truck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 2.92f)
                verticalLineTo(11.23f)
                curveTo(14f, 12.25f, 13.17f, 13.08f, 12.15f, 13.08f)
                horizontalLineTo(3f)
                curveTo(2.45f, 13.08f, 2f, 12.63f, 2f, 12.08f)
                verticalLineTo(5.69f)
                curveTo(2f, 3.65f, 3.65f, 2f, 5.69f, 2f)
                horizontalLineTo(13.07f)
                curveTo(13.59f, 2f, 14f, 2.41f, 14f, 2.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.5f, 15.5f)
                curveTo(21.78f, 15.5f, 22f, 15.72f, 22f, 16f)
                verticalLineTo(17f)
                curveTo(22f, 18.66f, 20.66f, 20f, 19f, 20f)
                curveTo(19f, 18.35f, 17.65f, 17f, 16f, 17f)
                curveTo(14.35f, 17f, 13f, 18.35f, 13f, 20f)
                horizontalLineTo(11f)
                curveTo(11f, 18.35f, 9.65f, 17f, 8f, 17f)
                curveTo(6.35f, 17f, 5f, 18.35f, 5f, 20f)
                curveTo(3.34f, 20f, 2f, 18.66f, 2f, 17f)
                verticalLineTo(15f)
                curveTo(2f, 14.45f, 2.45f, 14f, 3f, 14f)
                horizontalLineTo(12.5f)
                curveTo(13.88f, 14f, 15f, 12.88f, 15f, 11.5f)
                verticalLineTo(6f)
                curveTo(15f, 5.45f, 15.45f, 5f, 16f, 5f)
                horizontalLineTo(16.84f)
                curveTo(17.56f, 5f, 18.22f, 5.39f, 18.58f, 6.01f)
                lineTo(19.22f, 7.13f)
                curveTo(19.31f, 7.29f, 19.19f, 7.5f, 19f, 7.5f)
                curveTo(17.62f, 7.5f, 16.5f, 8.62f, 16.5f, 10f)
                verticalLineTo(13f)
                curveTo(16.5f, 14.38f, 17.62f, 15.5f, 19f, 15.5f)
                horizontalLineTo(21.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 22f)
                curveTo(9.105f, 22f, 10f, 21.105f, 10f, 20f)
                curveTo(10f, 18.895f, 9.105f, 18f, 8f, 18f)
                curveTo(6.895f, 18f, 6f, 18.895f, 6f, 20f)
                curveTo(6f, 21.105f, 6.895f, 22f, 8f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22f)
                curveTo(17.105f, 22f, 18f, 21.105f, 18f, 20f)
                curveTo(18f, 18.895f, 17.105f, 18f, 16f, 18f)
                curveTo(14.895f, 18f, 14f, 18.895f, 14f, 20f)
                curveTo(14f, 21.105f, 14.895f, 22f, 16f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 12.53f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                curveTo(18.45f, 14f, 18f, 13.55f, 18f, 13f)
                verticalLineTo(10f)
                curveTo(18f, 9.45f, 18.45f, 9f, 19f, 9f)
                horizontalLineTo(20.29f)
                lineTo(21.74f, 11.54f)
                curveTo(21.91f, 11.84f, 22f, 12.18f, 22f, 12.53f)
                close()
            }
        }.build()

        return _Truck!!
    }

@Suppress("ObjectPropertyName")
private var _Truck: ImageVector? = null
