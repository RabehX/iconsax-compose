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


val Iconsax.Filled.Ship: ImageVector
    get() {
        if (_Ship != null) {
            return _Ship!!
        }
        _Ship = ImageVector.Builder(
            name = "Filled.Ship",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.63f, 14.661f)
                lineTo(21.22f, 16.521f)
                curveTo(20.51f, 19.721f, 18f, 22.001f, 14.38f, 22.001f)
                horizontalLineTo(9.62f)
                curveTo(6f, 22.001f, 3.49f, 19.721f, 2.78f, 16.521f)
                lineTo(2.37f, 14.661f)
                curveTo(2.17f, 13.751f, 2.71f, 12.721f, 3.58f, 12.371f)
                lineTo(5f, 11.801f)
                lineTo(10.51f, 9.591f)
                curveTo(10.99f, 9.401f, 11.5f, 9.301f, 12f, 9.301f)
                curveTo(12.5f, 9.301f, 13.01f, 9.401f, 13.49f, 9.591f)
                lineTo(19f, 11.801f)
                lineTo(20.42f, 12.371f)
                curveTo(21.29f, 12.721f, 21.83f, 13.751f, 21.63f, 14.661f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 8f)
                verticalLineTo(9.44f)
                curveTo(19f, 9.79f, 18.64f, 10.04f, 18.31f, 9.9f)
                lineTo(14.04f, 8.19f)
                curveTo(12.73f, 7.68f, 11.27f, 7.68f, 9.95f, 8.2f)
                lineTo(5.69f, 9.91f)
                curveTo(5.36f, 10.05f, 5f, 9.8f, 5f, 9.45f)
                verticalLineTo(8f)
                curveTo(5f, 6.35f, 6.35f, 5f, 8f, 5f)
                horizontalLineTo(16f)
                curveTo(17.65f, 5f, 19f, 6.35f, 19f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 5f)
                horizontalLineTo(9.5f)
                verticalLineTo(3f)
                curveTo(9.5f, 2.45f, 9.95f, 2f, 10.5f, 2f)
                horizontalLineTo(13.5f)
                curveTo(14.05f, 2f, 14.5f, 2.45f, 14.5f, 3f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _Ship!!
    }

@Suppress("ObjectPropertyName")
private var _Ship: ImageVector? = null
