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


val Iconsax.Filled.Bookmark2: ImageVector
    get() {
        if (_Bookmark2 != null) {
            return _Bookmark2!!
        }
        _Bookmark2 = ImageVector.Builder(
            name = "Filled.Bookmark2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 4.96f)
                verticalLineTo(12.08f)
                curveTo(17f, 14.07f, 15.59f, 14.84f, 13.86f, 13.8f)
                lineTo(12.54f, 13f)
                curveTo(12.24f, 12.82f, 11.76f, 12.82f, 11.46f, 13f)
                lineTo(10.14f, 13.8f)
                curveTo(8.41f, 14.84f, 7f, 14.07f, 7f, 12.08f)
                verticalLineTo(4.99f)
                curveTo(7.01f, 3f, 8.01f, 2f, 10f, 2f)
                horizontalLineTo(14f)
                curveTo(15.98f, 2f, 16.98f, 2.99f, 17f, 4.96f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 11.901f)
                verticalLineTo(14.931f)
                curveTo(22f, 19.981f, 20f, 22.001f, 15f, 22.001f)
                horizontalLineTo(9f)
                curveTo(4f, 22.001f, 2f, 19.981f, 2f, 14.931f)
                verticalLineTo(11.901f)
                curveTo(2f, 9.211f, 2.57f, 7.381f, 3.85f, 6.261f)
                curveTo(4.5f, 5.711f, 5.5f, 6.191f, 5.5f, 7.041f)
                verticalLineTo(12.081f)
                curveTo(5.5f, 13.571f, 6.11f, 14.771f, 7.17f, 15.371f)
                curveTo(8.24f, 15.981f, 9.6f, 15.871f, 10.92f, 15.081f)
                lineTo(12f, 14.431f)
                lineTo(13.09f, 15.081f)
                curveTo(13.83f, 15.531f, 14.6f, 15.761f, 15.32f, 15.761f)
                curveTo(15.86f, 15.761f, 16.37f, 15.631f, 16.83f, 15.371f)
                curveTo(17.89f, 14.771f, 18.5f, 13.571f, 18.5f, 12.081f)
                verticalLineTo(7.031f)
                curveTo(18.5f, 6.181f, 19.51f, 5.701f, 20.15f, 6.261f)
                curveTo(21.43f, 7.381f, 22f, 9.211f, 22f, 11.901f)
                close()
            }
        }.build()

        return _Bookmark2!!
    }

@Suppress("ObjectPropertyName")
private var _Bookmark2: ImageVector? = null
