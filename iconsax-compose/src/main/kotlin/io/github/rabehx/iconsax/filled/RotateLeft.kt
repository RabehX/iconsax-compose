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


val Iconsax.Filled.RotateLeft: ImageVector
    get() {
        if (_RotateLeft != null) {
            return _RotateLeft!!
        }
        _RotateLeft = ImageVector.Builder(
            name = "Filled.RotateLeft",
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
                moveTo(12f, 18.58f)
                curveTo(8.83f, 18.58f, 6.25f, 16f, 6.25f, 12.83f)
                curveTo(6.25f, 11.69f, 6.58f, 10.58f, 7.22f, 9.64f)
                curveTo(7.45f, 9.3f, 7.92f, 9.2f, 8.26f, 9.43f)
                curveTo(8.6f, 9.66f, 8.7f, 10.13f, 8.47f, 10.47f)
                curveTo(8f, 11.17f, 7.76f, 11.99f, 7.76f, 12.83f)
                curveTo(7.76f, 15.17f, 9.67f, 17.08f, 12.01f, 17.08f)
                curveTo(14.35f, 17.08f, 16.26f, 15.17f, 16.26f, 12.83f)
                curveTo(16.26f, 10.59f, 14.52f, 8.75f, 12.32f, 8.59f)
                lineTo(12.73f, 8.89f)
                curveTo(13.06f, 9.13f, 13.14f, 9.6f, 12.89f, 9.94f)
                curveTo(12.65f, 10.27f, 12.18f, 10.35f, 11.84f, 10.1f)
                lineTo(9.9f, 8.69f)
                curveTo(9.83f, 8.64f, 9.77f, 8.58f, 9.72f, 8.51f)
                curveTo(9.71f, 8.5f, 9.7f, 8.49f, 9.69f, 8.47f)
                curveTo(9.65f, 8.4f, 9.62f, 8.32f, 9.6f, 8.24f)
                curveTo(9.58f, 8.14f, 9.58f, 8.05f, 9.59f, 7.95f)
                curveTo(9.6f, 7.91f, 9.61f, 7.87f, 9.62f, 7.83f)
                curveTo(9.64f, 7.76f, 9.68f, 7.7f, 9.72f, 7.63f)
                curveTo(9.74f, 7.62f, 9.76f, 7.6f, 9.78f, 7.58f)
                lineTo(11.44f, 5.68f)
                curveTo(11.71f, 5.37f, 12.19f, 5.34f, 12.5f, 5.61f)
                curveTo(12.81f, 5.88f, 12.84f, 6.36f, 12.57f, 6.67f)
                lineTo(12.2f, 7.1f)
                curveTo(15.28f, 7.2f, 17.76f, 9.74f, 17.76f, 12.85f)
                curveTo(17.75f, 16f, 15.17f, 18.58f, 12f, 18.58f)
                close()
            }
        }.build()

        return _RotateLeft!!
    }

@Suppress("ObjectPropertyName")
private var _RotateLeft: ImageVector? = null
