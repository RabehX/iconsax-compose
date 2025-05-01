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

val Iconsax.Outline.FilterTick: ImageVector
    get() {
        if (_FilterTick != null) {
            return _FilterTick!!
        }
        _FilterTick = ImageVector.Builder(
            name = "Outline.FilterTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.879f, 20.25f)
                curveTo(15.819f, 20.25f, 14.789f, 19.94f, 13.909f, 19.35f)
                curveTo(13.219f, 18.93f, 12.619f, 18.31f, 12.179f, 17.58f)
                curveTo(11.659f, 16.73f, 11.379f, 15.75f, 11.379f, 14.75f)
                curveTo(11.379f, 11.72f, 13.849f, 9.25f, 16.879f, 9.25f)
                curveTo(17.299f, 9.25f, 17.709f, 9.3f, 18.099f, 9.39f)
                curveTo(20.579f, 9.94f, 22.379f, 12.19f, 22.379f, 14.75f)
                curveTo(22.379f, 15.76f, 22.109f, 16.74f, 21.589f, 17.59f)
                curveTo(20.609f, 19.23f, 18.799f, 20.25f, 16.879f, 20.25f)
                close()
                moveTo(16.879f, 10.75f)
                curveTo(14.669f, 10.75f, 12.879f, 12.54f, 12.879f, 14.75f)
                curveTo(12.879f, 15.48f, 13.079f, 16.19f, 13.459f, 16.81f)
                curveTo(13.779f, 17.34f, 14.209f, 17.78f, 14.709f, 18.09f)
                curveTo(15.369f, 18.53f, 16.109f, 18.75f, 16.879f, 18.75f)
                curveTo(18.279f, 18.75f, 19.589f, 18.01f, 20.309f, 16.81f)
                curveTo(20.689f, 16.19f, 20.879f, 15.48f, 20.879f, 14.75f)
                curveTo(20.879f, 12.89f, 19.569f, 11.25f, 17.759f, 10.85f)
                curveTo(17.469f, 10.78f, 17.179f, 10.75f, 16.879f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.199f, 16.67f)
                curveTo(16.009f, 16.67f, 15.819f, 16.6f, 15.669f, 16.45f)
                lineTo(14.499f, 15.28f)
                curveTo(14.209f, 14.99f, 14.209f, 14.51f, 14.499f, 14.22f)
                curveTo(14.789f, 13.93f, 15.269f, 13.93f, 15.559f, 14.22f)
                lineTo(16.219f, 14.88f)
                lineTo(18.229f, 13.03f)
                curveTo(18.539f, 12.75f, 19.009f, 12.77f, 19.289f, 13.07f)
                curveTo(19.569f, 13.37f, 19.549f, 13.85f, 19.249f, 14.13f)
                lineTo(16.709f, 16.47f)
                curveTo(16.569f, 16.6f, 16.379f, 16.67f, 16.199f, 16.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.931f, 22.75f)
                curveTo(10.451f, 22.75f, 9.971f, 22.63f, 9.541f, 22.39f)
                curveTo(8.651f, 21.89f, 8.121f, 20.99f, 8.121f, 19.98f)
                verticalLineTo(14.63f)
                curveTo(8.121f, 14.12f, 7.791f, 13.37f, 7.471f, 12.98f)
                lineTo(3.671f, 8.99f)
                curveTo(3.041f, 8.34f, 2.551f, 7.25f, 2.551f, 6.45f)
                verticalLineTo(4.12f)
                curveTo(2.551f, 2.51f, 3.771f, 1.25f, 5.321f, 1.25f)
                horizontalLineTo(18.661f)
                curveTo(20.191f, 1.25f, 21.431f, 2.49f, 21.431f, 4.02f)
                verticalLineTo(6.24f)
                curveTo(21.431f, 7.29f, 20.811f, 8.47f, 20.201f, 9.09f)
                lineTo(18.401f, 10.68f)
                curveTo(18.221f, 10.84f, 17.971f, 10.9f, 17.731f, 10.85f)
                curveTo(17.461f, 10.78f, 17.171f, 10.75f, 16.871f, 10.75f)
                curveTo(14.661f, 10.75f, 12.871f, 12.54f, 12.871f, 14.75f)
                curveTo(12.871f, 15.48f, 13.071f, 16.19f, 13.451f, 16.81f)
                curveTo(13.771f, 17.34f, 14.201f, 17.78f, 14.701f, 18.09f)
                curveTo(14.921f, 18.23f, 15.061f, 18.47f, 15.061f, 18.73f)
                verticalLineTo(19.07f)
                curveTo(15.061f, 19.86f, 14.581f, 20.97f, 13.781f, 21.44f)
                lineTo(12.401f, 22.33f)
                curveTo(11.961f, 22.61f, 11.441f, 22.75f, 10.931f, 22.75f)
                close()
                moveTo(5.331f, 2.75f)
                curveTo(4.621f, 2.75f, 4.061f, 3.35f, 4.061f, 4.12f)
                verticalLineTo(6.45f)
                curveTo(4.061f, 6.81f, 4.361f, 7.54f, 4.761f, 7.94f)
                lineTo(8.611f, 11.99f)
                curveTo(9.121f, 12.62f, 9.631f, 13.68f, 9.631f, 14.63f)
                verticalLineTo(19.98f)
                curveTo(9.631f, 20.64f, 10.091f, 20.97f, 10.281f, 21.08f)
                curveTo(10.711f, 21.32f, 11.221f, 21.31f, 11.611f, 21.07f)
                lineTo(13.011f, 20.17f)
                curveTo(13.281f, 20.01f, 13.551f, 19.5f, 13.571f, 19.14f)
                curveTo(13.021f, 18.73f, 12.541f, 18.2f, 12.181f, 17.6f)
                curveTo(11.661f, 16.75f, 11.381f, 15.77f, 11.381f, 14.77f)
                curveTo(11.381f, 11.74f, 13.851f, 9.27f, 16.881f, 9.27f)
                curveTo(17.161f, 9.27f, 17.441f, 9.29f, 17.701f, 9.33f)
                lineTo(19.181f, 8.02f)
                curveTo(19.521f, 7.67f, 19.941f, 6.84f, 19.941f, 6.25f)
                verticalLineTo(4.03f)
                curveTo(19.941f, 3.33f, 19.371f, 2.76f, 18.671f, 2.76f)
                horizontalLineTo(5.331f)
                verticalLineTo(2.75f)
                close()
            }
        }.build()

        return _FilterTick!!
    }

@Suppress("ObjectPropertyName")
private var _FilterTick: ImageVector? = null
