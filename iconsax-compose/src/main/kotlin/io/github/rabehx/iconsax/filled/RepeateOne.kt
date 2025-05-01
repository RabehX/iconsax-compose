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


val Iconsax.Filled.RepeateOne: ImageVector
    get() {
        if (_RepeateOne != null) {
            return _RepeateOne!!
        }
        _RepeateOne = ImageVector.Builder(
            name = "Filled.RepeateOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.91f, 17.181f)
                curveTo(3.72f, 17.181f, 3.53f, 17.111f, 3.38f, 16.961f)
                curveTo(2.01f, 15.581f, 1.25f, 13.761f, 1.25f, 11.831f)
                curveTo(1.25f, 7.821f, 4.5f, 4.561f, 8.5f, 4.561f)
                lineTo(14.57f, 4.581f)
                lineTo(13.48f, 3.541f)
                curveTo(13.18f, 3.251f, 13.17f, 2.781f, 13.46f, 2.481f)
                curveTo(13.75f, 2.181f, 14.22f, 2.171f, 14.52f, 2.461f)
                lineTo(16.96f, 4.801f)
                curveTo(17.18f, 5.011f, 17.25f, 5.341f, 17.14f, 5.621f)
                curveTo(17.03f, 5.901f, 16.75f, 6.091f, 16.44f, 6.091f)
                lineTo(8.5f, 6.071f)
                curveTo(5.33f, 6.071f, 2.75f, 8.661f, 2.75f, 11.841f)
                curveTo(2.75f, 13.371f, 3.35f, 14.821f, 4.44f, 15.911f)
                curveTo(4.73f, 16.201f, 4.73f, 16.681f, 4.44f, 16.971f)
                curveTo(4.29f, 17.111f, 4.1f, 17.181f, 3.91f, 17.181f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 21.75f)
                curveTo(9.81f, 21.75f, 9.63f, 21.68f, 9.48f, 21.54f)
                lineTo(7.04f, 19.2f)
                curveTo(6.82f, 18.99f, 6.75f, 18.66f, 6.86f, 18.38f)
                curveTo(6.98f, 18.1f, 7.26f, 17.95f, 7.56f, 17.91f)
                lineTo(15.51f, 17.93f)
                curveTo(18.68f, 17.93f, 21.26f, 15.34f, 21.26f, 12.16f)
                curveTo(21.26f, 10.63f, 20.66f, 9.18f, 19.57f, 8.09f)
                curveTo(19.28f, 7.8f, 19.28f, 7.32f, 19.57f, 7.03f)
                curveTo(19.86f, 6.74f, 20.34f, 6.74f, 20.63f, 7.03f)
                curveTo(22f, 8.41f, 22.76f, 10.23f, 22.76f, 12.16f)
                curveTo(22.76f, 16.17f, 19.51f, 19.43f, 15.51f, 19.43f)
                lineTo(9.44f, 19.41f)
                lineTo(10.53f, 20.45f)
                curveTo(10.83f, 20.74f, 10.84f, 21.21f, 10.55f, 21.51f)
                curveTo(10.39f, 21.67f, 10.2f, 21.75f, 10f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.248f, 15.419f)
                curveTo(11.839f, 15.419f, 11.498f, 15.079f, 11.498f, 14.669f)
                verticalLineTo(11.279f)
                lineTo(11.309f, 11.489f)
                curveTo(11.028f, 11.799f, 10.559f, 11.819f, 10.248f, 11.549f)
                curveTo(9.939f, 11.279f, 9.919f, 10.799f, 10.189f, 10.489f)
                lineTo(11.689f, 8.819f)
                curveTo(11.899f, 8.589f, 12.229f, 8.509f, 12.519f, 8.619f)
                curveTo(12.809f, 8.739f, 12.998f, 9.009f, 12.998f, 9.329f)
                verticalLineTo(14.679f)
                curveTo(12.998f, 15.089f, 12.658f, 15.419f, 12.248f, 15.419f)
                close()
            }
        }.build()

        return _RepeateOne!!
    }

@Suppress("ObjectPropertyName")
private var _RepeateOne: ImageVector? = null
