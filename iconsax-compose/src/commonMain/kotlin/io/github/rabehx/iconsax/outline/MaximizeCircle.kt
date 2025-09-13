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

val Iconsax.Outline.MaximizeCircle: ImageVector
    get() {
        if (_MaximizeCircle != null) {
            return _MaximizeCircle!!
        }
        _MaximizeCircle = ImageVector.Builder(
            name = "Outline.MaximizeCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 7.75f)
                curveTo(20.59f, 7.75f, 20.25f, 7.41f, 20.25f, 7f)
                verticalLineTo(3.75f)
                horizontalLineTo(17f)
                curveTo(16.59f, 3.75f, 16.25f, 3.41f, 16.25f, 3f)
                curveTo(16.25f, 2.59f, 16.59f, 2.25f, 17f, 2.25f)
                horizontalLineTo(21f)
                curveTo(21.41f, 2.25f, 21.75f, 2.59f, 21.75f, 3f)
                verticalLineTo(7f)
                curveTo(21.75f, 7.41f, 21.41f, 7.75f, 21f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 9.75f)
                curveTo(14.809f, 9.75f, 14.62f, 9.68f, 14.469f, 9.53f)
                curveTo(14.179f, 9.24f, 14.179f, 8.76f, 14.469f, 8.47f)
                lineTo(20.469f, 2.47f)
                curveTo(20.76f, 2.18f, 21.24f, 2.18f, 21.529f, 2.47f)
                curveTo(21.819f, 2.76f, 21.819f, 3.24f, 21.529f, 3.53f)
                lineTo(15.53f, 9.53f)
                curveTo(15.38f, 9.68f, 15.189f, 9.75f, 15f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 21.75f)
                horizontalLineTo(3f)
                curveTo(2.59f, 21.75f, 2.25f, 21.41f, 2.25f, 21f)
                verticalLineTo(17f)
                curveTo(2.25f, 16.59f, 2.59f, 16.25f, 3f, 16.25f)
                curveTo(3.41f, 16.25f, 3.75f, 16.59f, 3.75f, 17f)
                verticalLineTo(20.25f)
                horizontalLineTo(7f)
                curveTo(7.41f, 20.25f, 7.75f, 20.59f, 7.75f, 21f)
                curveTo(7.75f, 21.41f, 7.41f, 21.75f, 7f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.999f, 21.75f)
                curveTo(2.809f, 21.75f, 2.619f, 21.68f, 2.469f, 21.53f)
                curveTo(2.179f, 21.24f, 2.179f, 20.76f, 2.469f, 20.47f)
                lineTo(8.469f, 14.47f)
                curveTo(8.759f, 14.18f, 9.24f, 14.18f, 9.53f, 14.47f)
                curveTo(9.82f, 14.76f, 9.82f, 15.24f, 9.53f, 15.53f)
                lineTo(3.53f, 21.53f)
                curveTo(3.38f, 21.68f, 3.189f, 21.75f, 2.999f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.2f, 14.75f)
                curveTo(1.85f, 14.75f, 1.54f, 14.5f, 1.47f, 14.15f)
                curveTo(1.33f, 13.45f, 1.25f, 12.72f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(12.73f, 1.25f, 13.46f, 1.32f, 14.17f, 1.47f)
                curveTo(14.58f, 1.55f, 14.84f, 1.95f, 14.76f, 2.35f)
                curveTo(14.68f, 2.76f, 14.27f, 3.01f, 13.88f, 2.94f)
                curveTo(13.27f, 2.82f, 12.64f, 2.75f, 12.01f, 2.75f)
                curveTo(6.91f, 2.75f, 2.76f, 6.9f, 2.76f, 12f)
                curveTo(2.76f, 12.62f, 2.82f, 13.25f, 2.95f, 13.85f)
                curveTo(3.03f, 14.26f, 2.77f, 14.65f, 2.36f, 14.73f)
                curveTo(2.3f, 14.75f, 2.25f, 14.75f, 2.2f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 22.75f)
                curveTo(11.271f, 22.75f, 10.541f, 22.68f, 9.831f, 22.53f)
                curveTo(9.421f, 22.45f, 9.161f, 22.05f, 9.241f, 21.65f)
                curveTo(9.321f, 21.24f, 9.731f, 20.99f, 10.121f, 21.06f)
                curveTo(10.731f, 21.18f, 11.361f, 21.25f, 11.991f, 21.25f)
                curveTo(17.091f, 21.25f, 21.241f, 17.1f, 21.241f, 12f)
                curveTo(21.241f, 11.38f, 21.181f, 10.76f, 21.061f, 10.15f)
                curveTo(20.981f, 9.74f, 21.241f, 9.35f, 21.651f, 9.27f)
                curveTo(22.051f, 9.19f, 22.451f, 9.45f, 22.531f, 9.86f)
                curveTo(22.671f, 10.56f, 22.741f, 11.28f, 22.741f, 12f)
                curveTo(22.751f, 17.93f, 17.931f, 22.75f, 12.001f, 22.75f)
                close()
            }
        }.build()

        return _MaximizeCircle!!
    }

@Suppress("ObjectPropertyName")
private var _MaximizeCircle: ImageVector? = null
