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


val Iconsax.Filled.TagCross: ImageVector
    get() {
        if (_TagCross != null) {
            return _TagCross!!
        }
        _TagCross = ImageVector.Builder(
            name = "Filled.TagCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 3.75f)
                horizontalLineTo(10.28f)
                curveTo(8.87f, 3.75f, 7.53f, 4.34f, 6.58f, 5.39f)
                lineTo(3.05f, 9.27f)
                curveTo(1.64f, 10.82f, 1.64f, 13.18f, 3.05f, 14.73f)
                lineTo(6.58f, 18.61f)
                curveTo(7.53f, 19.65f, 8.87f, 20.25f, 10.28f, 20.25f)
                horizontalLineTo(17f)
                curveTo(19.76f, 20.25f, 22f, 18.01f, 22f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(22f, 5.99f, 19.76f, 3.75f, 17f, 3.75f)
                close()
                moveTo(16.53f, 13.94f)
                curveTo(16.82f, 14.23f, 16.82f, 14.71f, 16.53f, 15f)
                curveTo(16.38f, 15.15f, 16.19f, 15.22f, 16f, 15.22f)
                curveTo(15.81f, 15.22f, 15.62f, 15.15f, 15.47f, 15f)
                lineTo(13.53f, 13.06f)
                lineTo(11.59f, 15f)
                curveTo(11.44f, 15.15f, 11.25f, 15.22f, 11.06f, 15.22f)
                curveTo(10.87f, 15.22f, 10.68f, 15.15f, 10.53f, 15f)
                curveTo(10.24f, 14.71f, 10.24f, 14.23f, 10.53f, 13.94f)
                lineTo(12.47f, 12f)
                lineTo(10.53f, 10.06f)
                curveTo(10.24f, 9.77f, 10.24f, 9.29f, 10.53f, 9f)
                curveTo(10.82f, 8.71f, 11.3f, 8.71f, 11.59f, 9f)
                lineTo(13.53f, 10.94f)
                lineTo(15.47f, 9f)
                curveTo(15.76f, 8.71f, 16.24f, 8.71f, 16.53f, 9f)
                curveTo(16.82f, 9.29f, 16.82f, 9.77f, 16.53f, 10.06f)
                lineTo(14.59f, 12f)
                lineTo(16.53f, 13.94f)
                close()
            }
        }.build()

        return _TagCross!!
    }

@Suppress("ObjectPropertyName")
private var _TagCross: ImageVector? = null
