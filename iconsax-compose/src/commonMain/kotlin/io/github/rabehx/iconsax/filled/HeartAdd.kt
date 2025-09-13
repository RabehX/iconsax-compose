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


val Iconsax.Filled.HeartAdd: ImageVector
    get() {
        if (_HeartAdd != null) {
            return _HeartAdd!!
        }
        _HeartAdd = ImageVector.Builder(
            name = "Filled.HeartAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.68f, 13.908f)
                verticalLineTo(13.898f)
                curveTo(19.8f, 12.968f, 18.57f, 12.398f, 17.2f, 12.398f)
                curveTo(14.55f, 12.398f, 12.4f, 14.548f, 12.4f, 17.198f)
                curveTo(12.4f, 18.428f, 12.87f, 19.548f, 13.63f, 20.398f)
                curveTo(14.51f, 21.378f, 15.78f, 21.998f, 17.2f, 21.998f)
                curveTo(19.85f, 21.998f, 22f, 19.848f, 22f, 17.198f)
                curveTo(22f, 15.928f, 21.5f, 14.768f, 20.68f, 13.908f)
                close()
                moveTo(18.99f, 18.008f)
                horizontalLineTo(17.95f)
                verticalLineTo(19.098f)
                curveTo(17.95f, 19.508f, 17.61f, 19.848f, 17.2f, 19.848f)
                curveTo(16.79f, 19.848f, 16.45f, 19.508f, 16.45f, 19.098f)
                verticalLineTo(18.008f)
                horizontalLineTo(15.41f)
                curveTo(14.99f, 18.008f, 14.66f, 17.678f, 14.66f, 17.258f)
                curveTo(14.66f, 16.848f, 14.98f, 16.518f, 15.4f, 16.508f)
                horizontalLineTo(16.45f)
                verticalLineTo(15.508f)
                curveTo(16.45f, 15.488f, 16.45f, 15.468f, 16.46f, 15.448f)
                curveTo(16.48f, 15.068f, 16.81f, 14.758f, 17.2f, 14.758f)
                curveTo(17.6f, 14.758f, 17.93f, 15.078f, 17.95f, 15.478f)
                verticalLineTo(16.508f)
                horizontalLineTo(18.99f)
                curveTo(19.41f, 16.508f, 19.74f, 16.848f, 19.74f, 17.258f)
                curveTo(19.74f, 17.678f, 19.41f, 18.008f, 18.99f, 18.008f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 8.731f)
                curveTo(22f, 9.921f, 21.81f, 11.021f, 21.48f, 12.041f)
                curveTo(21.42f, 12.251f, 21.17f, 12.311f, 20.99f, 12.181f)
                curveTo(19.9f, 11.371f, 18.57f, 10.941f, 17.2f, 10.941f)
                curveTo(13.73f, 10.941f, 10.9f, 13.771f, 10.9f, 17.241f)
                curveTo(10.9f, 18.321f, 11.18f, 19.381f, 11.71f, 20.321f)
                curveTo(11.87f, 20.601f, 11.68f, 20.961f, 11.38f, 20.851f)
                curveTo(8.97f, 20.031f, 4.1f, 17.041f, 2.52f, 12.041f)
                curveTo(2.19f, 11.021f, 2f, 9.921f, 2f, 8.731f)
                curveTo(2f, 5.641f, 4.49f, 3.141f, 7.56f, 3.141f)
                curveTo(9.37f, 3.141f, 10.99f, 4.021f, 12f, 5.371f)
                curveTo(13.01f, 4.021f, 14.63f, 3.141f, 16.44f, 3.141f)
                curveTo(19.51f, 3.141f, 22f, 5.641f, 22f, 8.731f)
                close()
            }
        }.build()

        return _HeartAdd!!
    }

@Suppress("ObjectPropertyName")
private var _HeartAdd: ImageVector? = null
