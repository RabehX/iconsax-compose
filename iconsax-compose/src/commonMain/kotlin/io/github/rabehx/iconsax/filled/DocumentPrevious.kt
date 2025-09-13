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


val Iconsax.Filled.DocumentPrevious: ImageVector
    get() {
        if (_DocumentPrevious != null) {
            return _DocumentPrevious!!
        }
        _DocumentPrevious = ImageVector.Builder(
            name = "Filled.DocumentPrevious",
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
                moveTo(13f, 15.75f)
                horizontalLineTo(8.81f)
                lineTo(9.53f, 16.47f)
                curveTo(9.82f, 16.76f, 9.82f, 17.24f, 9.53f, 17.53f)
                curveTo(9.38f, 17.68f, 9.19f, 17.75f, 9f, 17.75f)
                curveTo(8.81f, 17.75f, 8.62f, 17.68f, 8.47f, 17.53f)
                lineTo(6.47f, 15.53f)
                curveTo(6.4f, 15.46f, 6.36f, 15.39f, 6.32f, 15.31f)
                curveTo(6.31f, 15.29f, 6.3f, 15.26f, 6.29f, 15.24f)
                curveTo(6.27f, 15.18f, 6.26f, 15.12f, 6.25f, 15.06f)
                curveTo(6.25f, 15.03f, 6.25f, 15.01f, 6.25f, 14.98f)
                curveTo(6.25f, 14.9f, 6.27f, 14.82f, 6.3f, 14.74f)
                curveTo(6.3f, 14.73f, 6.3f, 14.73f, 6.31f, 14.72f)
                curveTo(6.34f, 14.64f, 6.4f, 14.56f, 6.46f, 14.5f)
                curveTo(6.47f, 14.49f, 6.47f, 14.48f, 6.48f, 14.48f)
                lineTo(8.48f, 12.48f)
                curveTo(8.77f, 12.19f, 9.25f, 12.19f, 9.54f, 12.48f)
                curveTo(9.83f, 12.77f, 9.83f, 13.25f, 9.54f, 13.54f)
                lineTo(8.82f, 14.26f)
                horizontalLineTo(13f)
                curveTo(13.41f, 14.26f, 13.75f, 14.6f, 13.75f, 15.01f)
                curveTo(13.75f, 15.42f, 13.41f, 15.75f, 13f, 15.75f)
                close()
            }
        }.build()

        return _DocumentPrevious!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentPrevious: ImageVector? = null
