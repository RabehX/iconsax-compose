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

val Iconsax.Outline.TagCross: ImageVector
    get() {
        if (_TagCross != null) {
            return _TagCross!!
        }
        _TagCross = ImageVector.Builder(
            name = "Outline.TagCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 21f)
                horizontalLineTo(10.28f)
                curveTo(8.66f, 21f, 7.11f, 20.31f, 6.03f, 19.12f)
                lineTo(2.5f, 15.24f)
                curveTo(0.82f, 13.4f, 0.82f, 10.62f, 2.5f, 8.77f)
                lineTo(6.03f, 4.89f)
                curveTo(7.11f, 3.69f, 8.66f, 3f, 10.28f, 3f)
                horizontalLineTo(17f)
                curveTo(20.17f, 3f, 22.75f, 5.58f, 22.75f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(22.75f, 18.42f, 20.17f, 21f, 17f, 21f)
                close()
                moveTo(10.28f, 4.5f)
                curveTo(9.09f, 4.5f, 7.94f, 5.01f, 7.14f, 5.89f)
                lineTo(3.6f, 9.78f)
                curveTo(2.45f, 11.05f, 2.45f, 12.96f, 3.6f, 14.23f)
                lineTo(7.13f, 18.11f)
                curveTo(7.93f, 18.99f, 9.08f, 19.5f, 10.27f, 19.5f)
                horizontalLineTo(17f)
                curveTo(19.34f, 19.5f, 21.25f, 17.59f, 21.25f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(21.25f, 6.41f, 19.34f, 4.5f, 17f, 4.5f)
                horizontalLineTo(10.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 15.22f)
                curveTo(15.81f, 15.22f, 15.62f, 15.15f, 15.47f, 15f)
                lineTo(10.53f, 10.05f)
                curveTo(10.24f, 9.76f, 10.24f, 9.28f, 10.53f, 8.99f)
                curveTo(10.82f, 8.7f, 11.3f, 8.7f, 11.59f, 8.99f)
                lineTo(16.53f, 13.94f)
                curveTo(16.82f, 14.23f, 16.82f, 14.71f, 16.53f, 15f)
                curveTo(16.38f, 15.15f, 16.19f, 15.22f, 16f, 15.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.06f, 15.22f)
                curveTo(10.87f, 15.22f, 10.68f, 15.15f, 10.53f, 15f)
                curveTo(10.24f, 14.71f, 10.24f, 14.23f, 10.53f, 13.94f)
                lineTo(15.47f, 9f)
                curveTo(15.76f, 8.71f, 16.24f, 8.71f, 16.53f, 9f)
                curveTo(16.82f, 9.29f, 16.82f, 9.77f, 16.53f, 10.06f)
                lineTo(11.59f, 15f)
                curveTo(11.44f, 15.15f, 11.25f, 15.22f, 11.06f, 15.22f)
                close()
            }
        }.build()

        return _TagCross!!
    }

@Suppress("ObjectPropertyName")
private var _TagCross: ImageVector? = null
