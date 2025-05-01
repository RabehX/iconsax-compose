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


val Iconsax.Filled.HierarchySquare: ImageVector
    get() {
        if (_HierarchySquare != null) {
            return _HierarchySquare!!
        }
        _HierarchySquare = ImageVector.Builder(
            name = "Filled.HierarchySquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(9.85f, 16.45f)
                curveTo(9.85f, 17.58f, 8.93f, 18.5f, 7.8f, 18.5f)
                curveTo(6.67f, 18.5f, 5.75f, 17.58f, 5.75f, 16.45f)
                curveTo(5.75f, 15.58f, 6.29f, 14.85f, 7.05f, 14.55f)
                verticalLineTo(10.26f)
                curveTo(6.21f, 9.95f, 5.6f, 9.15f, 5.6f, 8.2f)
                curveTo(5.6f, 6.99f, 6.59f, 6f, 7.8f, 6f)
                curveTo(9.01f, 6f, 10f, 6.99f, 10f, 8.2f)
                curveTo(10f, 9.15f, 9.39f, 9.95f, 8.55f, 10.26f)
                verticalLineTo(14.55f)
                curveTo(9.31f, 14.85f, 9.85f, 15.59f, 9.85f, 16.45f)
                close()
                moveTo(16.75f, 18.5f)
                curveTo(15.62f, 18.5f, 14.7f, 17.58f, 14.7f, 16.45f)
                curveTo(14.7f, 15.58f, 15.24f, 14.85f, 16f, 14.55f)
                verticalLineTo(8.75f)
                curveTo(16f, 8.61f, 15.89f, 8.5f, 15.75f, 8.5f)
                horizontalLineTo(14.62f)
                lineTo(14.83f, 8.67f)
                curveTo(15.15f, 8.94f, 15.19f, 9.41f, 14.93f, 9.73f)
                curveTo(14.78f, 9.91f, 14.56f, 10f, 14.35f, 10f)
                curveTo(14.18f, 10f, 14.01f, 9.94f, 13.87f, 9.83f)
                lineTo(12.07f, 8.33f)
                curveTo(11.9f, 8.18f, 11.8f, 7.97f, 11.8f, 7.75f)
                curveTo(11.8f, 7.53f, 11.9f, 7.32f, 12.07f, 7.17f)
                lineTo(13.87f, 5.67f)
                curveTo(14.19f, 5.41f, 14.66f, 5.45f, 14.93f, 5.77f)
                curveTo(15.2f, 6.09f, 15.15f, 6.56f, 14.83f, 6.83f)
                lineTo(14.62f, 7f)
                horizontalLineTo(15.75f)
                curveTo(16.71f, 7f, 17.5f, 7.79f, 17.5f, 8.75f)
                verticalLineTo(14.55f)
                curveTo(18.26f, 14.85f, 18.8f, 15.59f, 18.8f, 16.45f)
                curveTo(18.8f, 17.58f, 17.88f, 18.5f, 16.75f, 18.5f)
                close()
            }
        }.build()

        return _HierarchySquare!!
    }

@Suppress("ObjectPropertyName")
private var _HierarchySquare: ImageVector? = null
