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

val Iconsax.Outline.VideoPlay: ImageVector
    get() {
        if (_VideoPlay != null) {
            return _VideoPlay!!
        }
        _VideoPlay = ImageVector.Builder(
            name = "Outline.VideoPlay",
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
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.479f, 7.86f)
                horizontalLineTo(2.52f)
                curveTo(2.11f, 7.86f, 1.77f, 7.52f, 1.77f, 7.11f)
                curveTo(1.77f, 6.7f, 2.1f, 6.36f, 2.52f, 6.36f)
                horizontalLineTo(21.479f)
                curveTo(21.889f, 6.36f, 22.229f, 6.7f, 22.229f, 7.11f)
                curveTo(22.229f, 7.52f, 21.899f, 7.86f, 21.479f, 7.86f)
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
                moveTo(11.09f, 18.12f)
                curveTo(10.73f, 18.12f, 10.39f, 18.03f, 10.08f, 17.86f)
                curveTo(9.4f, 17.46f, 9f, 16.66f, 9f, 15.65f)
                verticalLineTo(13.25f)
                curveTo(9f, 12.24f, 9.4f, 11.43f, 10.09f, 11.03f)
                curveTo(10.78f, 10.63f, 11.68f, 10.69f, 12.55f, 11.2f)
                lineTo(14.63f, 12.4f)
                curveTo(15.5f, 12.9f, 16.01f, 13.65f, 16.01f, 14.45f)
                curveTo(16.01f, 15.25f, 15.5f, 16f, 14.62f, 16.5f)
                lineTo(12.54f, 17.7f)
                curveTo(12.06f, 17.98f, 11.56f, 18.12f, 11.09f, 18.12f)
                close()
                moveTo(11.1f, 12.27f)
                curveTo(11f, 12.27f, 10.91f, 12.29f, 10.84f, 12.33f)
                curveTo(10.63f, 12.45f, 10.5f, 12.79f, 10.5f, 13.25f)
                verticalLineTo(15.65f)
                curveTo(10.5f, 16.1f, 10.63f, 16.44f, 10.84f, 16.57f)
                curveTo(11.05f, 16.69f, 11.41f, 16.63f, 11.8f, 16.4f)
                lineTo(13.88f, 15.2f)
                curveTo(14.27f, 14.97f, 14.51f, 14.69f, 14.51f, 14.45f)
                curveTo(14.51f, 14.21f, 14.28f, 13.93f, 13.88f, 13.7f)
                lineTo(11.8f, 12.5f)
                curveTo(11.54f, 12.35f, 11.29f, 12.27f, 11.1f, 12.27f)
                close()
            }
        }.build()

        return _VideoPlay!!
    }

@Suppress("ObjectPropertyName")
private var _VideoPlay: ImageVector? = null
