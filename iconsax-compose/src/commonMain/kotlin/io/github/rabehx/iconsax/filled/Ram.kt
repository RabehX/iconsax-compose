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


val Iconsax.Filled.Ram: ImageVector
    get() {
        if (_Ram != null) {
            return _Ram!!
        }
        _Ram = ImageVector.Builder(
            name = "Filled.Ram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.5f, 9f)
                curveTo(20.05f, 9f, 20.5f, 8.55f, 20.5f, 8f)
                verticalLineTo(7f)
                curveTo(20.5f, 4f, 18.97f, 2f, 15.5f, 2f)
                horizontalLineTo(8.5f)
                curveTo(4.97f, 2f, 3.5f, 4f, 3.5f, 7f)
                verticalLineTo(17f)
                curveTo(3.5f, 19.314f, 4.378f, 21.025f, 6.395f, 21.684f)
                curveTo(6.696f, 21.782f, 6.989f, 21.542f, 6.988f, 21.225f)
                lineTo(6.98f, 19f)
                curveTo(6.98f, 17.34f, 8.33f, 16f, 9.98f, 16f)
                horizontalLineTo(13.99f)
                curveTo(15.63f, 16f, 16.98f, 17.34f, 16.99f, 18.98f)
                lineTo(17.006f, 21.227f)
                curveTo(17.008f, 21.544f, 17.302f, 21.78f, 17.602f, 21.679f)
                curveTo(19.59f, 21.013f, 20.5f, 19.303f, 20.5f, 17f)
                verticalLineTo(15.83f)
                curveTo(20.5f, 15.3f, 20.29f, 14.79f, 19.91f, 14.41f)
                lineTo(19.09f, 13.59f)
                curveTo(18.71f, 13.21f, 18.5f, 12.7f, 18.5f, 12.17f)
                verticalLineTo(10f)
                curveTo(18.5f, 9.45f, 18.95f, 9f, 19.5f, 9f)
                close()
                moveTo(13.97f, 8.53f)
                horizontalLineTo(7.97f)
                curveTo(7.56f, 8.53f, 7.22f, 8.19f, 7.22f, 7.78f)
                curveTo(7.22f, 7.37f, 7.56f, 7.03f, 7.97f, 7.03f)
                horizontalLineTo(13.97f)
                curveTo(14.38f, 7.03f, 14.72f, 7.37f, 14.72f, 7.78f)
                curveTo(14.72f, 8.19f, 14.39f, 8.53f, 13.97f, 8.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.01f, 20.97f)
                curveTo(16.016f, 21.526f, 15.567f, 21.98f, 15.01f, 21.98f)
                horizontalLineTo(8.994f)
                curveTo(8.444f, 21.98f, 7.997f, 21.536f, 7.994f, 20.987f)
                lineTo(7.98f, 19f)
                curveTo(7.98f, 17.9f, 8.87f, 17f, 9.98f, 17f)
                horizontalLineTo(13.991f)
                curveTo(15.09f, 17f, 15.981f, 17.89f, 15.991f, 18.99f)
                lineTo(16.01f, 20.97f)
                close()
            }
        }.build()

        return _Ram!!
    }

@Suppress("ObjectPropertyName")
private var _Ram: ImageVector? = null
