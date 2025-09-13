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


val Iconsax.Filled.Hierarchy: ImageVector
    get() {
        if (_Hierarchy != null) {
            return _Hierarchy!!
        }
        _Hierarchy = ImageVector.Builder(
            name = "Filled.Hierarchy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.25f, 8.5f)
                curveTo(7.045f, 8.5f, 8.5f, 7.045f, 8.5f, 5.25f)
                curveTo(8.5f, 3.455f, 7.045f, 2f, 5.25f, 2f)
                curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
                curveTo(2f, 7.045f, 3.455f, 8.5f, 5.25f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 22f)
                curveTo(6.657f, 22f, 8f, 20.657f, 8f, 19f)
                curveTo(8f, 17.343f, 6.657f, 16f, 5f, 16f)
                curveTo(3.343f, 16f, 2f, 17.343f, 2f, 19f)
                curveTo(2f, 20.657f, 3.343f, 22f, 5f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 22f)
                curveTo(20.657f, 22f, 22f, 20.657f, 22f, 19f)
                curveTo(22f, 17.343f, 20.657f, 16f, 19f, 16f)
                curveTo(17.343f, 16f, 16f, 17.343f, 16f, 19f)
                curveTo(16f, 20.657f, 17.343f, 22f, 19f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.17f, 15.98f)
                curveTo(18.2f, 13.2f, 15.58f, 11.33f, 12.63f, 11.33f)
                curveTo(12.62f, 11.33f, 12.61f, 11.33f, 12.6f, 11.33f)
                lineTo(9.07f, 11.34f)
                curveTo(7.55f, 11.36f, 6.19f, 10.33f, 5.78f, 8.85f)
                verticalLineTo(7.01f)
                curveTo(5.78f, 6.59f, 5.44f, 6.25f, 5.01f, 6.25f)
                curveTo(4.58f, 6.25f, 4.25f, 6.59f, 4.25f, 7.01f)
                verticalLineTo(18.23f)
                curveTo(4.25f, 18.65f, 4.59f, 18.99f, 5.01f, 18.99f)
                curveTo(5.43f, 18.99f, 5.78f, 18.65f, 5.78f, 18.23f)
                verticalLineTo(11.61f)
                curveTo(6.66f, 12.39f, 7.81f, 12.87f, 9.06f, 12.87f)
                curveTo(9.07f, 12.87f, 9.07f, 12.87f, 9.08f, 12.87f)
                lineTo(12.61f, 12.86f)
                curveTo(12.62f, 12.86f, 12.62f, 12.86f, 12.63f, 12.86f)
                curveTo(14.92f, 12.86f, 16.97f, 14.31f, 17.72f, 16.48f)
                curveTo(17.84f, 16.8f, 18.13f, 17f, 18.45f, 17f)
                curveTo(18.53f, 17f, 18.62f, 16.99f, 18.7f, 16.96f)
                curveTo(19.1f, 16.82f, 19.31f, 16.38f, 19.17f, 15.98f)
                close()
            }
        }.build()

        return _Hierarchy!!
    }

@Suppress("ObjectPropertyName")
private var _Hierarchy: ImageVector? = null
