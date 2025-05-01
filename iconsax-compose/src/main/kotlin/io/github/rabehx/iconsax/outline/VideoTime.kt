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

val Iconsax.Outline.VideoTime: ImageVector
    get() {
        if (_VideoTime != null) {
            return _VideoTime!!
        }
        _VideoTime = ImageVector.Builder(
            name = "Outline.VideoTime",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 15.24f, 22.75f, 15.49f, 22.73f, 15.72f)
                curveTo(22.7f, 16.02f, 22.49f, 16.28f, 22.2f, 16.37f)
                curveTo(21.91f, 16.46f, 21.59f, 16.36f, 21.4f, 16.12f)
                curveTo(20.69f, 15.25f, 19.64f, 14.75f, 18.5f, 14.75f)
                curveTo(17.65f, 14.75f, 16.82f, 15.04f, 16.16f, 15.57f)
                curveTo(15.26f, 16.28f, 14.75f, 17.34f, 14.75f, 18.5f)
                curveTo(14.75f, 19.63f, 15.25f, 20.69f, 16.12f, 21.4f)
                curveTo(16.36f, 21.59f, 16.45f, 21.91f, 16.37f, 22.2f)
                curveTo(16.28f, 22.49f, 16.03f, 22.7f, 15.72f, 22.73f)
                curveTo(15.49f, 22.75f, 15.24f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(14.02f)
                curveTo(13.52f, 20.44f, 13.25f, 19.49f, 13.25f, 18.5f)
                curveTo(13.25f, 16.88f, 13.97f, 15.39f, 15.23f, 14.4f)
                curveTo(16.91f, 13.04f, 19.46f, 12.92f, 21.25f, 14.02f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.48f, 7.86f)
                horizontalLineTo(2.52f)
                curveTo(2.11f, 7.86f, 1.77f, 7.52f, 1.77f, 7.11f)
                curveTo(1.77f, 6.7f, 2.11f, 6.36f, 2.52f, 6.36f)
                horizontalLineTo(21.48f)
                curveTo(21.89f, 6.36f, 22.23f, 6.7f, 22.23f, 7.11f)
                curveTo(22.23f, 7.52f, 21.9f, 7.86f, 21.48f, 7.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.52f, 7.72f)
                curveTo(8.11f, 7.72f, 7.77f, 7.38f, 7.77f, 6.97f)
                verticalLineTo(2.11f)
                curveTo(7.77f, 1.7f, 8.11f, 1.36f, 8.52f, 1.36f)
                curveTo(8.93f, 1.36f, 9.27f, 1.7f, 9.27f, 2.11f)
                verticalLineTo(6.97f)
                curveTo(9.27f, 7.38f, 8.93f, 7.72f, 8.52f, 7.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.481f, 7.27f)
                curveTo(15.071f, 7.27f, 14.731f, 6.93f, 14.731f, 6.52f)
                verticalLineTo(2.11f)
                curveTo(14.731f, 1.7f, 15.071f, 1.36f, 15.481f, 1.36f)
                curveTo(15.891f, 1.36f, 16.23f, 1.7f, 16.23f, 2.11f)
                verticalLineTo(6.52f)
                curveTo(16.23f, 6.94f, 15.901f, 7.27f, 15.481f, 7.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 23.75f)
                curveTo(17.28f, 23.75f, 16.1f, 23.33f, 15.17f, 22.56f)
                curveTo(13.95f, 21.57f, 13.25f, 20.09f, 13.25f, 18.5f)
                curveTo(13.25f, 16.88f, 13.97f, 15.39f, 15.23f, 14.4f)
                curveTo(16.15f, 13.66f, 17.31f, 13.25f, 18.5f, 13.25f)
                curveTo(20.09f, 13.25f, 21.57f, 13.95f, 22.56f, 15.18f)
                curveTo(23.32f, 16.1f, 23.75f, 17.28f, 23.75f, 18.5f)
                curveTo(23.75f, 19.99f, 23.1f, 21.43f, 21.97f, 22.44f)
                curveTo(20.99f, 23.29f, 19.76f, 23.75f, 18.5f, 23.75f)
                close()
                moveTo(18.5f, 14.75f)
                curveTo(17.65f, 14.75f, 16.82f, 15.04f, 16.16f, 15.57f)
                curveTo(15.26f, 16.28f, 14.75f, 17.34f, 14.75f, 18.5f)
                curveTo(14.75f, 19.63f, 15.25f, 20.69f, 16.12f, 21.4f)
                curveTo(17.48f, 22.53f, 19.59f, 22.52f, 20.98f, 21.31f)
                curveTo(21.78f, 20.59f, 22.25f, 19.56f, 22.25f, 18.5f)
                curveTo(22.25f, 17.63f, 21.95f, 16.79f, 21.4f, 16.13f)
                curveTo(20.69f, 15.25f, 19.63f, 14.75f, 18.5f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.379f, 20.38f)
                curveTo(17.129f, 20.38f, 16.879f, 20.25f, 16.739f, 20.02f)
                curveTo(16.529f, 19.66f, 16.639f, 19.2f, 16.999f, 18.99f)
                lineTo(18.039f, 18.37f)
                verticalLineTo(17.11f)
                curveTo(18.039f, 16.7f, 18.379f, 16.36f, 18.789f, 16.36f)
                curveTo(19.199f, 16.36f, 19.539f, 16.7f, 19.539f, 17.11f)
                verticalLineTo(18.8f)
                curveTo(19.539f, 19.06f, 19.399f, 19.31f, 19.179f, 19.44f)
                lineTo(17.769f, 20.28f)
                curveTo(17.639f, 20.34f, 17.509f, 20.38f, 17.379f, 20.38f)
                close()
            }
        }.build()

        return _VideoTime!!
    }

@Suppress("ObjectPropertyName")
private var _VideoTime: ImageVector? = null
