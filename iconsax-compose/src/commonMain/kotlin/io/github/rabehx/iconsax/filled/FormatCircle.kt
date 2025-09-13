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


val Iconsax.Filled.FormatCircle: ImageVector
    get() {
        if (_FormatCircle != null) {
            return _FormatCircle!!
        }
        _FormatCircle = ImageVector.Builder(
            name = "Filled.FormatCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.1f, 7.87f)
                curveTo(21.68f, 7.23f, 22f, 6.4f, 22f, 5.53f)
                curveTo(22f, 3.58f, 20.42f, 2f, 18.47f, 2f)
                curveTo(17.6f, 2f, 16.78f, 2.32f, 16.14f, 2.9f)
                curveTo(14.85f, 2.3f, 13.46f, 2f, 12f, 2f)
                curveTo(10.57f, 2f, 9.15f, 2.31f, 7.87f, 2.9f)
                curveTo(7.23f, 2.32f, 6.4f, 2f, 5.53f, 2f)
                curveTo(3.58f, 2f, 2f, 3.58f, 2f, 5.53f)
                curveTo(2f, 6.4f, 2.32f, 7.23f, 2.9f, 7.87f)
                curveTo(2.31f, 9.15f, 2f, 10.57f, 2f, 12f)
                curveTo(2f, 13.46f, 2.3f, 14.85f, 2.9f, 16.14f)
                curveTo(2.32f, 16.78f, 2f, 17.6f, 2f, 18.47f)
                curveTo(2f, 20.42f, 3.58f, 22f, 5.53f, 22f)
                curveTo(6.4f, 22f, 7.23f, 21.68f, 7.87f, 21.1f)
                curveTo(9.15f, 21.69f, 10.57f, 22f, 12f, 22f)
                curveTo(13.46f, 22f, 14.85f, 21.7f, 16.14f, 21.1f)
                curveTo(16.78f, 21.68f, 17.6f, 22f, 18.47f, 22f)
                curveTo(20.42f, 22f, 22f, 20.42f, 22f, 18.47f)
                curveTo(22f, 17.6f, 21.68f, 16.78f, 21.1f, 16.14f)
                curveTo(21.7f, 14.85f, 22f, 13.46f, 22f, 12f)
                curveTo(22f, 10.57f, 21.69f, 9.15f, 21.1f, 7.87f)
                close()
                moveTo(19.68f, 15.17f)
                curveTo(19.57f, 15.13f, 19.46f, 15.09f, 19.35f, 15.06f)
                curveTo(19.18f, 15.02f, 19f, 14.99f, 18.83f, 14.97f)
                curveTo(18.71f, 14.96f, 18.59f, 14.95f, 18.47f, 14.95f)
                curveTo(16.53f, 14.95f, 14.95f, 16.53f, 14.95f, 18.47f)
                curveTo(14.95f, 18.59f, 14.96f, 18.71f, 14.97f, 18.83f)
                curveTo(14.99f, 19f, 15.02f, 19.18f, 15.06f, 19.35f)
                curveTo(15.09f, 19.46f, 15.13f, 19.57f, 15.17f, 19.68f)
                curveTo(15.17f, 19.71f, 15.18f, 19.74f, 15.2f, 19.77f)
                curveTo(15.21f, 19.8f, 15.22f, 19.83f, 15.23f, 19.86f)
                curveTo(13.22f, 20.7f, 10.82f, 20.71f, 8.77f, 19.86f)
                curveTo(8.78f, 19.83f, 8.79f, 19.8f, 8.8f, 19.77f)
                curveTo(8.82f, 19.74f, 8.83f, 19.71f, 8.83f, 19.68f)
                curveTo(8.87f, 19.57f, 8.91f, 19.46f, 8.94f, 19.35f)
                curveTo(8.98f, 19.18f, 9.01f, 19f, 9.03f, 18.83f)
                curveTo(9.04f, 18.71f, 9.05f, 18.59f, 9.05f, 18.47f)
                curveTo(9.05f, 16.53f, 7.47f, 14.95f, 5.53f, 14.95f)
                curveTo(5.41f, 14.95f, 5.29f, 14.96f, 5.17f, 14.97f)
                curveTo(5f, 14.99f, 4.82f, 15.02f, 4.65f, 15.06f)
                curveTo(4.54f, 15.09f, 4.43f, 15.13f, 4.32f, 15.17f)
                curveTo(4.29f, 15.17f, 4.26f, 15.18f, 4.23f, 15.2f)
                curveTo(4.2f, 15.21f, 4.17f, 15.22f, 4.14f, 15.23f)
                curveTo(3.71f, 14.22f, 3.5f, 13.13f, 3.5f, 12f)
                curveTo(3.5f, 10.89f, 3.72f, 9.78f, 4.14f, 8.77f)
                curveTo(4.15f, 8.77f, 4.17f, 8.78f, 4.18f, 8.78f)
                curveTo(4.06f, 8.73f, 3.93f, 8.67f, 3.82f, 8.61f)
                curveTo(3.66f, 8.52f, 3.5f, 8.42f, 3.35f, 8.3f)
                curveTo(3.65f, 8.53f, 3.97f, 8.71f, 4.32f, 8.83f)
                curveTo(4.44f, 8.88f, 4.57f, 8.92f, 4.69f, 8.95f)
                curveTo(4.77f, 8.97f, 4.84f, 8.98f, 4.91f, 8.99f)
                curveTo(5f, 9.01f, 5.08f, 9.02f, 5.17f, 9.03f)
                curveTo(5.29f, 9.04f, 5.41f, 9.05f, 5.53f, 9.05f)
                curveTo(7.47f, 9.05f, 9.05f, 7.47f, 9.05f, 5.53f)
                curveTo(9.05f, 5.41f, 9.04f, 5.29f, 9.03f, 5.17f)
                curveTo(9.02f, 5.08f, 9.01f, 5f, 8.99f, 4.91f)
                curveTo(8.98f, 4.84f, 8.97f, 4.77f, 8.95f, 4.69f)
                curveTo(8.92f, 4.57f, 8.88f, 4.44f, 8.83f, 4.32f)
                curveTo(8.71f, 3.97f, 8.53f, 3.65f, 8.3f, 3.35f)
                curveTo(8.42f, 3.5f, 8.52f, 3.66f, 8.61f, 3.82f)
                curveTo(8.67f, 3.93f, 8.73f, 4.06f, 8.78f, 4.18f)
                curveTo(8.78f, 4.17f, 8.77f, 4.15f, 8.77f, 4.14f)
                curveTo(10.81f, 3.29f, 13.22f, 3.3f, 15.23f, 4.14f)
                curveTo(15.22f, 4.17f, 15.21f, 4.2f, 15.2f, 4.23f)
                curveTo(15.18f, 4.26f, 15.17f, 4.29f, 15.17f, 4.32f)
                curveTo(15.13f, 4.43f, 15.09f, 4.54f, 15.06f, 4.65f)
                curveTo(15.02f, 4.82f, 14.99f, 5f, 14.97f, 5.17f)
                curveTo(14.96f, 5.29f, 14.95f, 5.41f, 14.95f, 5.53f)
                curveTo(14.95f, 7.47f, 16.53f, 9.05f, 18.47f, 9.05f)
                curveTo(18.59f, 9.05f, 18.71f, 9.04f, 18.83f, 9.03f)
                curveTo(19f, 9.01f, 19.18f, 8.98f, 19.35f, 8.94f)
                curveTo(19.46f, 8.91f, 19.57f, 8.87f, 19.68f, 8.83f)
                curveTo(19.71f, 8.83f, 19.74f, 8.82f, 19.77f, 8.8f)
                curveTo(19.8f, 8.79f, 19.83f, 8.78f, 19.86f, 8.77f)
                curveTo(20.28f, 9.78f, 20.5f, 10.89f, 20.5f, 12f)
                curveTo(20.5f, 13.13f, 20.29f, 14.22f, 19.86f, 15.23f)
                curveTo(19.83f, 15.22f, 19.8f, 15.21f, 19.77f, 15.2f)
                curveTo(19.74f, 15.18f, 19.71f, 15.17f, 19.68f, 15.17f)
                close()
            }
        }.build()

        return _FormatCircle!!
    }

@Suppress("ObjectPropertyName")
private var _FormatCircle: ImageVector? = null
