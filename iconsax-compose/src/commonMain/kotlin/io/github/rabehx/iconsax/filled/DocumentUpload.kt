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


val Iconsax.Filled.DocumentUpload: ImageVector
    get() {
        if (_DocumentUpload != null) {
            return _DocumentUpload!!
        }
        _DocumentUpload = ImageVector.Builder(
            name = "Filled.DocumentUpload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 10.19f)
                horizontalLineTo(17.61f)
                curveTo(15.24f, 10.19f, 13.31f, 8.26f, 13.31f, 5.89f)
                verticalLineTo(3f)
                curveTo(13.31f, 2.45f, 12.86f, 2f, 12.31f, 2f)
                horizontalLineTo(8.07f)
                curveTo(4.99f, 2f, 2.5f, 4f, 2.5f, 7.57f)
                verticalLineTo(16.43f)
                curveTo(2.5f, 20f, 4.99f, 22f, 8.07f, 22f)
                horizontalLineTo(15.93f)
                curveTo(19.01f, 22f, 21.5f, 20f, 21.5f, 16.43f)
                verticalLineTo(11.19f)
                curveTo(21.5f, 10.64f, 21.05f, 10.19f, 20.5f, 10.19f)
                close()
                moveTo(11.53f, 13.53f)
                curveTo(11.38f, 13.68f, 11.19f, 13.75f, 11f, 13.75f)
                curveTo(10.81f, 13.75f, 10.62f, 13.68f, 10.47f, 13.53f)
                lineTo(9.75f, 12.81f)
                verticalLineTo(17f)
                curveTo(9.75f, 17.41f, 9.41f, 17.75f, 9f, 17.75f)
                curveTo(8.59f, 17.75f, 8.25f, 17.41f, 8.25f, 17f)
                verticalLineTo(12.81f)
                lineTo(7.53f, 13.53f)
                curveTo(7.24f, 13.82f, 6.76f, 13.82f, 6.47f, 13.53f)
                curveTo(6.18f, 13.24f, 6.18f, 12.76f, 6.47f, 12.47f)
                lineTo(8.47f, 10.47f)
                curveTo(8.54f, 10.41f, 8.61f, 10.36f, 8.69f, 10.32f)
                curveTo(8.71f, 10.31f, 8.74f, 10.3f, 8.76f, 10.29f)
                curveTo(8.82f, 10.27f, 8.88f, 10.26f, 8.95f, 10.25f)
                curveTo(8.98f, 10.25f, 9f, 10.25f, 9.03f, 10.25f)
                curveTo(9.11f, 10.25f, 9.19f, 10.27f, 9.27f, 10.3f)
                curveTo(9.28f, 10.3f, 9.28f, 10.3f, 9.29f, 10.3f)
                curveTo(9.37f, 10.33f, 9.45f, 10.39f, 9.51f, 10.45f)
                curveTo(9.52f, 10.46f, 9.53f, 10.46f, 9.53f, 10.47f)
                lineTo(11.53f, 12.47f)
                curveTo(11.82f, 12.76f, 11.82f, 13.24f, 11.53f, 13.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.43f, 8.81f)
                curveTo(18.38f, 8.82f, 19.7f, 8.82f, 20.83f, 8.82f)
                curveTo(21.4f, 8.82f, 21.7f, 8.15f, 21.3f, 7.75f)
                curveTo(19.86f, 6.3f, 17.28f, 3.69f, 15.8f, 2.21f)
                curveTo(15.39f, 1.8f, 14.68f, 2.08f, 14.68f, 2.65f)
                verticalLineTo(6.14f)
                curveTo(14.68f, 7.6f, 15.92f, 8.81f, 17.43f, 8.81f)
                close()
            }
        }.build()

        return _DocumentUpload!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentUpload: ImageVector? = null
