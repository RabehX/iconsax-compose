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


val Iconsax.Filled.HeartRemove: ImageVector
    get() {
        if (_HeartRemove != null) {
            return _HeartRemove!!
        }
        _HeartRemove = ImageVector.Builder(
            name = "Filled.HeartRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.69f, 13.918f)
                curveTo(20.68f, 13.918f, 20.68f, 13.908f, 20.68f, 13.908f)
                verticalLineTo(13.898f)
                curveTo(19.8f, 12.978f, 18.57f, 12.398f, 17.2f, 12.398f)
                curveTo(14.55f, 12.398f, 12.4f, 14.548f, 12.4f, 17.198f)
                curveTo(12.4f, 18.428f, 12.87f, 19.548f, 13.63f, 20.398f)
                curveTo(14.51f, 21.378f, 15.78f, 21.998f, 17.2f, 21.998f)
                curveTo(19.85f, 21.998f, 22f, 19.848f, 22f, 17.198f)
                curveTo(22f, 15.928f, 21.5f, 14.778f, 20.69f, 13.918f)
                close()
                moveTo(19.01f, 19.068f)
                curveTo(18.87f, 19.208f, 18.67f, 19.288f, 18.48f, 19.288f)
                curveTo(18.29f, 19.288f, 18.1f, 19.208f, 17.95f, 19.068f)
                lineTo(17.21f, 18.328f)
                lineTo(16.45f, 19.098f)
                curveTo(16.3f, 19.238f, 16.11f, 19.318f, 15.92f, 19.318f)
                curveTo(15.82f, 19.318f, 15.73f, 19.298f, 15.64f, 19.258f)
                curveTo(15.55f, 19.228f, 15.46f, 19.168f, 15.39f, 19.098f)
                curveTo(15.09f, 18.798f, 15.09f, 18.328f, 15.39f, 18.038f)
                lineTo(16.15f, 17.268f)
                lineTo(15.42f, 16.528f)
                curveTo(15.12f, 16.238f, 15.12f, 15.758f, 15.42f, 15.468f)
                curveTo(15.71f, 15.178f, 16.18f, 15.178f, 16.48f, 15.468f)
                lineTo(17.21f, 16.208f)
                lineTo(17.92f, 15.498f)
                curveTo(18.22f, 15.208f, 18.69f, 15.208f, 18.98f, 15.498f)
                curveTo(19.15f, 15.668f, 19.22f, 15.888f, 19.19f, 16.108f)
                curveTo(19.18f, 16.278f, 19.11f, 16.438f, 18.98f, 16.558f)
                lineTo(18.27f, 17.268f)
                lineTo(19.01f, 18.008f)
                curveTo(19.31f, 18.298f, 19.31f, 18.768f, 19.01f, 19.068f)
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

        return _HeartRemove!!
    }

@Suppress("ObjectPropertyName")
private var _HeartRemove: ImageVector? = null
