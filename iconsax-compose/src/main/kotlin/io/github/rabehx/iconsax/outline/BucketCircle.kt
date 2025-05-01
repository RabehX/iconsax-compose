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

val Iconsax.Outline.BucketCircle: ImageVector
    get() {
        if (_BucketCircle != null) {
            return _BucketCircle!!
        }
        _BucketCircle = ImageVector.Builder(
            name = "Outline.BucketCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.609f, 17.31f)
                curveTo(10.019f, 17.31f, 9.429f, 17.04f, 8.879f, 16.49f)
                lineTo(6.489f, 14.1f)
                curveTo(5.389f, 13f, 5.389f, 11.74f, 6.489f, 10.65f)
                lineTo(10.479f, 6.66f)
                curveTo(10.619f, 6.52f, 10.809f, 6.44f, 11.009f, 6.44f)
                curveTo(11.209f, 6.44f, 11.399f, 6.52f, 11.539f, 6.66f)
                lineTo(15.929f, 11.05f)
                curveTo(16.179f, 11.3f, 16.309f, 11.63f, 16.309f, 11.98f)
                curveTo(16.309f, 12.33f, 16.169f, 12.66f, 15.919f, 12.91f)
                lineTo(12.329f, 16.5f)
                curveTo(11.789f, 17.03f, 11.199f, 17.31f, 10.609f, 17.31f)
                close()
                moveTo(11.009f, 8.24f)
                lineTo(7.549f, 11.7f)
                curveTo(7.379f, 11.87f, 7.169f, 12.13f, 7.169f, 12.37f)
                curveTo(7.169f, 12.61f, 7.379f, 12.86f, 7.549f, 13.04f)
                lineTo(9.939f, 15.43f)
                curveTo(10.109f, 15.6f, 10.369f, 15.81f, 10.609f, 15.81f)
                curveTo(10.849f, 15.81f, 11.099f, 15.6f, 11.279f, 15.43f)
                lineTo(14.739f, 11.97f)
                lineTo(11.009f, 8.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.01f, 7.93f)
                curveTo(10.82f, 7.93f, 10.63f, 7.86f, 10.48f, 7.71f)
                lineTo(9.68f, 6.91f)
                curveTo(9.39f, 6.62f, 9.39f, 6.14f, 9.68f, 5.85f)
                curveTo(9.97f, 5.56f, 10.45f, 5.56f, 10.74f, 5.85f)
                lineTo(11.54f, 6.65f)
                curveTo(11.83f, 6.94f, 11.83f, 7.42f, 11.54f, 7.71f)
                curveTo(11.39f, 7.86f, 11.2f, 7.93f, 11.01f, 7.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.46f, 13.08f)
                curveTo(6.06f, 13.08f, 5.73f, 12.77f, 5.71f, 12.36f)
                curveTo(5.69f, 11.95f, 6.01f, 11.6f, 6.43f, 11.58f)
                lineTo(15.46f, 11.19f)
                curveTo(15.87f, 11.16f, 16.22f, 11.49f, 16.24f, 11.91f)
                curveTo(16.26f, 12.33f, 15.94f, 12.67f, 15.52f, 12.69f)
                lineTo(6.49f, 13.08f)
                curveTo(6.48f, 13.08f, 6.47f, 13.08f, 6.46f, 13.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.471f, 17.95f)
                curveTo(15.451f, 17.95f, 14.621f, 17.12f, 14.621f, 16.1f)
                curveTo(14.621f, 15.15f, 15.621f, 13.99f, 15.921f, 13.66f)
                curveTo(16.201f, 13.35f, 16.741f, 13.35f, 17.021f, 13.66f)
                curveTo(17.321f, 13.99f, 18.321f, 15.15f, 18.321f, 16.1f)
                curveTo(18.331f, 17.12f, 17.501f, 17.95f, 16.471f, 17.95f)
                close()
                moveTo(16.471f, 15.38f)
                curveTo(16.261f, 15.69f, 16.121f, 15.97f, 16.121f, 16.1f)
                curveTo(16.121f, 16.29f, 16.281f, 16.45f, 16.471f, 16.45f)
                curveTo(16.661f, 16.45f, 16.821f, 16.29f, 16.821f, 16.1f)
                curveTo(16.831f, 15.97f, 16.681f, 15.69f, 16.471f, 15.38f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
        }.build()

        return _BucketCircle!!
    }

@Suppress("ObjectPropertyName")
private var _BucketCircle: ImageVector? = null
