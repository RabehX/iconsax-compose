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

val Iconsax.Outline.MusicDashboard: ImageVector
    get() {
        if (_MusicDashboard != null) {
            return _MusicDashboard!!
        }
        _MusicDashboard = ImageVector.Builder(
            name = "Outline.MusicDashboard",
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
                moveTo(7f, 22.25f)
                curveTo(6.59f, 22.25f, 6.25f, 21.91f, 6.25f, 21.5f)
                verticalLineTo(2.5f)
                curveTo(6.25f, 2.09f, 6.59f, 1.75f, 7f, 1.75f)
                curveTo(7.41f, 1.75f, 7.75f, 2.09f, 7.75f, 2.5f)
                verticalLineTo(21.5f)
                curveTo(7.75f, 21.91f, 7.41f, 22.25f, 7f, 22.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.47f, 17.55f)
                curveTo(10.231f, 17.55f, 9.23f, 16.54f, 9.23f, 15.31f)
                curveTo(9.23f, 14.08f, 10.241f, 13.07f, 11.47f, 13.07f)
                curveTo(12.7f, 13.07f, 13.71f, 14.08f, 13.71f, 15.31f)
                curveTo(13.71f, 16.54f, 12.7f, 17.55f, 11.47f, 17.55f)
                close()
                moveTo(11.47f, 14.56f)
                curveTo(11.061f, 14.56f, 10.731f, 14.89f, 10.731f, 15.3f)
                curveTo(10.731f, 15.71f, 11.061f, 16.04f, 11.47f, 16.04f)
                curveTo(11.88f, 16.04f, 12.21f, 15.71f, 12.21f, 15.3f)
                curveTo(12.21f, 14.89f, 11.87f, 14.56f, 11.47f, 14.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.961f, 16.06f)
                curveTo(12.551f, 16.06f, 12.211f, 15.72f, 12.211f, 15.31f)
                verticalLineTo(9.3f)
                curveTo(12.211f, 8.38f, 12.791f, 7.62f, 13.681f, 7.38f)
                lineTo(16.661f, 6.57f)
                curveTo(17.581f, 6.32f, 18.161f, 6.56f, 18.481f, 6.81f)
                curveTo(18.941f, 7.16f, 19.181f, 7.73f, 19.181f, 8.5f)
                verticalLineTo(14.33f)
                curveTo(19.181f, 14.74f, 18.841f, 15.08f, 18.431f, 15.08f)
                curveTo(18.021f, 15.08f, 17.681f, 14.74f, 17.681f, 14.33f)
                verticalLineTo(8.5f)
                curveTo(17.681f, 8.17f, 17.611f, 8.03f, 17.571f, 8.01f)
                curveTo(17.521f, 7.97f, 17.351f, 7.95f, 17.061f, 8.03f)
                lineTo(14.081f, 8.84f)
                curveTo(13.841f, 8.91f, 13.721f, 9.06f, 13.721f, 9.32f)
                verticalLineTo(15.33f)
                curveTo(13.711f, 15.72f, 13.371f, 16.06f, 12.961f, 16.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.93f, 16.55f)
                curveTo(15.689f, 16.55f, 14.689f, 15.54f, 14.689f, 14.31f)
                curveTo(14.689f, 13.07f, 15.7f, 12.07f, 16.93f, 12.07f)
                curveTo(18.16f, 12.07f, 19.17f, 13.08f, 19.17f, 14.31f)
                curveTo(19.18f, 15.55f, 18.17f, 16.55f, 16.93f, 16.55f)
                close()
                moveTo(16.93f, 13.57f)
                curveTo(16.52f, 13.57f, 16.19f, 13.9f, 16.19f, 14.31f)
                curveTo(16.19f, 14.72f, 16.52f, 15.05f, 16.93f, 15.05f)
                curveTo(17.34f, 15.05f, 17.67f, 14.72f, 17.67f, 14.31f)
                curveTo(17.67f, 13.9f, 17.34f, 13.57f, 16.93f, 13.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.96f, 11.79f)
                curveTo(12.63f, 11.79f, 12.33f, 11.57f, 12.24f, 11.24f)
                curveTo(12.13f, 10.84f, 12.37f, 10.43f, 12.77f, 10.32f)
                lineTo(18.24f, 8.83f)
                curveTo(18.64f, 8.72f, 19.05f, 8.96f, 19.16f, 9.36f)
                curveTo(19.27f, 9.76f, 19.03f, 10.17f, 18.63f, 10.28f)
                lineTo(13.16f, 11.77f)
                curveTo(13.09f, 11.78f, 13.02f, 11.79f, 12.96f, 11.79f)
                close()
            }
        }.build()

        return _MusicDashboard!!
    }

@Suppress("ObjectPropertyName")
private var _MusicDashboard: ImageVector? = null
