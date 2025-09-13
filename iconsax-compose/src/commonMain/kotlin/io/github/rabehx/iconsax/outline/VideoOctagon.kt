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

val Iconsax.Outline.VideoOctagon: ImageVector
    get() {
        if (_VideoOctagon != null) {
            return _VideoOctagon!!
        }
        _VideoOctagon = ImageVector.Builder(
            name = "Outline.VideoOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.33f, 22.75f, 10.65f, 22.58f, 10.05f, 22.23f)
                lineTo(4.11f, 18.8f)
                curveTo(2.91f, 18.1f, 2.16f, 16.81f, 2.16f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(2.16f, 7.19f, 2.91f, 5.9f, 4.11f, 5.2f)
                lineTo(10.05f, 1.77f)
                curveTo(11.25f, 1.07f, 12.74f, 1.07f, 13.95f, 1.77f)
                lineTo(19.89f, 5.2f)
                curveTo(21.09f, 5.9f, 21.84f, 7.19f, 21.84f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(21.84f, 16.81f, 21.09f, 18.1f, 19.89f, 18.8f)
                lineTo(13.95f, 22.23f)
                curveTo(13.35f, 22.58f, 12.67f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(11.59f, 2.75f, 11.17f, 2.86f, 10.8f, 3.07f)
                lineTo(4.86f, 6.5f)
                curveTo(4.12f, 6.93f, 3.66f, 7.72f, 3.66f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(3.66f, 16.27f, 4.12f, 17.07f, 4.86f, 17.5f)
                lineTo(10.8f, 20.93f)
                curveTo(11.54f, 21.36f, 12.46f, 21.36f, 13.2f, 20.93f)
                lineTo(19.14f, 17.5f)
                curveTo(19.88f, 17.07f, 20.34f, 16.28f, 20.34f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(20.34f, 7.73f, 19.88f, 6.93f, 19.14f, 6.5f)
                lineTo(13.2f, 3.07f)
                curveTo(12.83f, 2.86f, 12.41f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.09f, 15.67f)
                curveTo(10.73f, 15.67f, 10.39f, 15.58f, 10.08f, 15.41f)
                curveTo(9.39f, 15.01f, 8.99f, 14.2f, 8.99f, 13.19f)
                verticalLineTo(10.79f)
                curveTo(8.99f, 9.78f, 9.39f, 8.97f, 10.08f, 8.57f)
                curveTo(10.77f, 8.17f, 11.67f, 8.23f, 12.54f, 8.74f)
                lineTo(14.62f, 9.94f)
                curveTo(15.49f, 10.44f, 16f, 11.19f, 16f, 11.99f)
                curveTo(16f, 12.79f, 15.5f, 13.53f, 14.62f, 14.04f)
                lineTo(12.54f, 15.24f)
                curveTo(12.06f, 15.53f, 11.56f, 15.67f, 11.09f, 15.67f)
                close()
                moveTo(11.1f, 9.82f)
                curveTo(11f, 9.82f, 10.91f, 9.84f, 10.84f, 9.88f)
                curveTo(10.63f, 10f, 10.5f, 10.34f, 10.5f, 10.8f)
                verticalLineTo(13.2f)
                curveTo(10.5f, 13.65f, 10.63f, 13.99f, 10.84f, 14.12f)
                curveTo(11.05f, 14.24f, 11.41f, 14.18f, 11.8f, 13.95f)
                lineTo(13.88f, 12.75f)
                curveTo(14.27f, 12.52f, 14.5f, 12.24f, 14.5f, 12f)
                curveTo(14.5f, 11.76f, 14.27f, 11.48f, 13.88f, 11.25f)
                lineTo(11.8f, 10.05f)
                curveTo(11.54f, 9.9f, 11.29f, 9.82f, 11.1f, 9.82f)
                close()
            }
        }.build()

        return _VideoOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _VideoOctagon: ImageVector? = null
