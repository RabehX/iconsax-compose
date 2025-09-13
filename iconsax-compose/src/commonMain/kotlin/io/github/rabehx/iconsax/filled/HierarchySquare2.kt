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


val Iconsax.Filled.HierarchySquare2: ImageVector
    get() {
        if (_HierarchySquare2 != null) {
            return _HierarchySquare2!!
        }
        _HierarchySquare2 = ImageVector.Builder(
            name = "Filled.HierarchySquare2",
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
                moveTo(16.2f, 18.25f)
                curveTo(15.07f, 18.25f, 14.15f, 17.33f, 14.15f, 16.2f)
                curveTo(14.15f, 15.54f, 14.47f, 14.96f, 14.96f, 14.58f)
                curveTo(14.54f, 13.48f, 13.49f, 12.72f, 12.31f, 12.76f)
                lineTo(10.25f, 12.77f)
                horizontalLineTo(10.24f)
                curveTo(9.63f, 12.77f, 9.05f, 12.59f, 8.56f, 12.28f)
                verticalLineTo(14.3f)
                curveTo(9.32f, 14.6f, 9.86f, 15.34f, 9.86f, 16.2f)
                curveTo(9.86f, 17.33f, 8.94f, 18.25f, 7.81f, 18.25f)
                curveTo(6.68f, 18.25f, 5.76f, 17.33f, 5.76f, 16.2f)
                curveTo(5.76f, 15.33f, 6.3f, 14.6f, 7.06f, 14.3f)
                verticalLineTo(9.95f)
                curveTo(6.3f, 9.6f, 5.76f, 8.84f, 5.76f, 7.95f)
                curveTo(5.76f, 6.74f, 6.75f, 5.75f, 7.96f, 5.75f)
                curveTo(9.17f, 5.75f, 10.16f, 6.74f, 10.16f, 7.95f)
                curveTo(10.16f, 8.93f, 9.51f, 9.75f, 8.62f, 10.04f)
                curveTo(8.82f, 10.77f, 9.48f, 11.28f, 10.24f, 11.28f)
                curveTo(10.24f, 11.28f, 10.24f, 11.28f, 10.25f, 11.28f)
                lineTo(12.31f, 11.27f)
                curveTo(12.32f, 11.27f, 12.32f, 11.27f, 12.33f, 11.27f)
                curveTo(14.17f, 11.27f, 15.82f, 12.44f, 16.42f, 14.18f)
                curveTo(17.45f, 14.29f, 18.26f, 15.15f, 18.26f, 16.21f)
                curveTo(18.25f, 17.33f, 17.33f, 18.25f, 16.2f, 18.25f)
                close()
            }
        }.build()

        return _HierarchySquare2!!
    }

@Suppress("ObjectPropertyName")
private var _HierarchySquare2: ImageVector? = null
