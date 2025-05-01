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

val Iconsax.Outline.MonitorRecorder: ImageVector
    get() {
        if (_MonitorRecorder != null) {
            return _MonitorRecorder!!
        }
        _MonitorRecorder = ImageVector.Builder(
            name = "Outline.MonitorRecorder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.56f, 17.97f)
                horizontalLineTo(6.44f)
                curveTo(2.46f, 17.97f, 1.25f, 16.76f, 1.25f, 12.78f)
                verticalLineTo(6.44f)
                curveTo(1.25f, 2.46f, 2.46f, 1.25f, 6.44f, 1.25f)
                horizontalLineTo(8f)
                curveTo(8.41f, 1.25f, 8.75f, 1.59f, 8.75f, 2f)
                curveTo(8.75f, 2.41f, 8.41f, 2.75f, 8f, 2.75f)
                horizontalLineTo(6.44f)
                curveTo(3.3f, 2.75f, 2.75f, 3.3f, 2.75f, 6.44f)
                verticalLineTo(12.77f)
                curveTo(2.75f, 15.91f, 3.3f, 16.46f, 6.44f, 16.46f)
                horizontalLineTo(17.55f)
                curveTo(20.69f, 16.46f, 21.24f, 15.91f, 21.24f, 12.77f)
                verticalLineTo(11.88f)
                curveTo(21.24f, 11.47f, 21.58f, 11.13f, 21.99f, 11.13f)
                curveTo(22.4f, 11.13f, 22.74f, 11.47f, 22.74f, 11.88f)
                verticalLineTo(12.77f)
                curveTo(22.75f, 16.76f, 21.54f, 17.97f, 17.56f, 17.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                verticalLineTo(17.22f)
                curveTo(11.25f, 16.81f, 11.59f, 16.47f, 12f, 16.47f)
                curveTo(12.41f, 16.47f, 12.75f, 16.81f, 12.75f, 17.22f)
                verticalLineTo(22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 13.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 13.75f, 1.25f, 13.41f, 1.25f, 13f)
                curveTo(1.25f, 12.59f, 1.59f, 12.25f, 2f, 12.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 12.25f, 22.75f, 12.59f, 22.75f, 13f)
                curveTo(22.75f, 13.41f, 22.41f, 13.75f, 22f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 22.75f)
                horizontalLineTo(7.5f)
                curveTo(7.09f, 22.75f, 6.75f, 22.41f, 6.75f, 22f)
                curveTo(6.75f, 21.59f, 7.09f, 21.25f, 7.5f, 21.25f)
                horizontalLineTo(16.5f)
                curveTo(16.91f, 21.25f, 17.25f, 21.59f, 17.25f, 22f)
                curveTo(17.25f, 22.41f, 16.91f, 22.75f, 16.5f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.86f, 10.12f)
                horizontalLineTo(13.1f)
                curveTo(11.53f, 10.12f, 10.51f, 9.1f, 10.51f, 7.53f)
                verticalLineTo(4.01f)
                curveTo(10.51f, 2.49f, 11.74f, 1.26f, 13.26f, 1.26f)
                horizontalLineTo(17.86f)
                curveTo(19.29f, 1.26f, 20.45f, 2.42f, 20.45f, 3.85f)
                verticalLineTo(7.53f)
                curveTo(20.45f, 8.96f, 19.29f, 10.12f, 17.86f, 10.12f)
                close()
                moveTo(13.26f, 2.76f)
                curveTo(12.57f, 2.76f, 12.01f, 3.32f, 12.01f, 4.01f)
                verticalLineTo(7.53f)
                curveTo(12.01f, 8.51f, 12.63f, 8.62f, 13.1f, 8.62f)
                horizontalLineTo(17.86f)
                curveTo(18.46f, 8.62f, 18.95f, 8.13f, 18.95f, 7.53f)
                verticalLineTo(3.85f)
                curveTo(18.95f, 3.25f, 18.46f, 2.76f, 17.86f, 2.76f)
                horizontalLineTo(13.26f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.45f, 8.87f)
                curveTo(21.13f, 8.87f, 20.8f, 8.76f, 20.48f, 8.53f)
                lineTo(19.27f, 7.68f)
                curveTo(19.07f, 7.54f, 18.95f, 7.31f, 18.95f, 7.07f)
                verticalLineTo(4.31f)
                curveTo(18.95f, 4.07f, 19.07f, 3.84f, 19.27f, 3.7f)
                lineTo(20.48f, 2.85f)
                curveTo(21f, 2.48f, 21.56f, 2.41f, 22.02f, 2.65f)
                curveTo(22.48f, 2.89f, 22.74f, 3.39f, 22.74f, 4.03f)
                verticalLineTo(7.36f)
                curveTo(22.74f, 8f, 22.48f, 8.5f, 22.02f, 8.74f)
                curveTo(21.85f, 8.83f, 21.66f, 8.87f, 21.45f, 8.87f)
                close()
                moveTo(20.45f, 6.68f)
                lineTo(21.25f, 7.24f)
                verticalLineTo(4.14f)
                lineTo(20.45f, 4.7f)
                verticalLineTo(6.68f)
                close()
            }
        }.build()

        return _MonitorRecorder!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorRecorder: ImageVector? = null
