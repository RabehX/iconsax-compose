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


val Iconsax.Filled.DocumentCloud: ImageVector
    get() {
        if (_DocumentCloud != null) {
            return _DocumentCloud!!
        }
        _DocumentCloud = ImageVector.Builder(
            name = "Filled.DocumentCloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.8f, 2.21f)
                curveTo(15.39f, 1.8f, 14.68f, 2.08f, 14.68f, 2.65f)
                verticalLineTo(6.14f)
                curveTo(14.68f, 7.6f, 15.92f, 8.81f, 17.43f, 8.81f)
                curveTo(18.38f, 8.82f, 19.7f, 8.82f, 20.83f, 8.82f)
                curveTo(21.4f, 8.82f, 21.7f, 8.15f, 21.3f, 7.75f)
                curveTo(19.86f, 6.3f, 17.28f, 3.69f, 15.8f, 2.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.76f, 19.262f)
                curveTo(12.41f, 19.432f, 12.41f, 22.832f, 14.76f, 23.002f)
                horizontalLineTo(20.32f)
                curveTo(20.99f, 23.002f, 21.65f, 22.752f, 22.14f, 22.302f)
                curveTo(23.791f, 20.862f, 22.91f, 17.982f, 20.74f, 17.712f)
                curveTo(19.961f, 13.022f, 13.181f, 14.802f, 14.781f, 19.272f)
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.5f, 11.19f)
                verticalLineTo(14.44f)
                curveTo(21.5f, 14.74f, 21.06f, 14.88f, 20.84f, 14.67f)
                curveTo(20.36f, 14.2f, 19.77f, 13.84f, 19.09f, 13.63f)
                curveTo(17.41f, 13.11f, 15.46f, 13.62f, 14.25f, 14.9f)
                curveTo(13.44f, 15.74f, 13.03f, 16.81f, 13.04f, 17.97f)
                curveTo(13.04f, 18.16f, 12.95f, 18.33f, 12.8f, 18.44f)
                curveTo(12f, 19.05f, 11.5f, 20.01f, 11.5f, 21.12f)
                curveTo(11.5f, 21.2f, 11.5f, 21.28f, 11.51f, 21.36f)
                curveTo(11.53f, 21.68f, 11.3f, 21.99f, 10.97f, 21.99f)
                horizontalLineTo(8.07f)
                curveTo(4.99f, 21.99f, 2.5f, 19.99f, 2.5f, 16.42f)
                verticalLineTo(7.57f)
                curveTo(2.5f, 4f, 4.99f, 2f, 8.07f, 2f)
                horizontalLineTo(12.31f)
                curveTo(12.86f, 2f, 13.31f, 2.45f, 13.31f, 3f)
                verticalLineTo(5.89f)
                curveTo(13.31f, 8.27f, 15.23f, 10.19f, 17.61f, 10.19f)
                horizontalLineTo(20.5f)
                curveTo(21.05f, 10.19f, 21.5f, 10.64f, 21.5f, 11.19f)
                close()
            }
        }.build()

        return _DocumentCloud!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentCloud: ImageVector? = null
