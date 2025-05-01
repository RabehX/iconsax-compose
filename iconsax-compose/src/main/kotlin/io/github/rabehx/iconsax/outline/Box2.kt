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

val Iconsax.Outline.Box2: ImageVector
    get() {
        if (_Box2 != null) {
            return _Box2!!
        }
        _Box2 = ImageVector.Builder(
            name = "Outline.Box2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.999f, 22.75f)
                curveTo(11.939f, 22.75f, 11.879f, 22.74f, 11.829f, 22.73f)
                curveTo(11.769f, 22.72f, 11.709f, 22.69f, 11.649f, 22.66f)
                lineTo(9.439f, 21.56f)
                curveTo(9.069f, 21.37f, 8.919f, 20.92f, 9.099f, 20.55f)
                curveTo(9.289f, 20.18f, 9.739f, 20.03f, 10.109f, 20.21f)
                lineTo(11.249f, 20.78f)
                verticalLineTo(19.22f)
                curveTo(11.249f, 18.81f, 11.589f, 18.47f, 11.999f, 18.47f)
                curveTo(12.409f, 18.47f, 12.749f, 18.81f, 12.749f, 19.22f)
                verticalLineTo(20.78f)
                lineTo(13.889f, 20.21f)
                curveTo(14.259f, 20.03f, 14.709f, 20.18f, 14.899f, 20.55f)
                curveTo(15.089f, 20.92f, 14.939f, 21.37f, 14.559f, 21.56f)
                lineTo(12.349f, 22.66f)
                curveTo(12.289f, 22.69f, 12.229f, 22.71f, 12.169f, 22.73f)
                curveTo(12.109f, 22.74f, 12.059f, 22.75f, 11.999f, 22.75f)
                close()
                moveTo(18.669f, 19.42f)
                curveTo(18.399f, 19.42f, 18.129f, 19.27f, 17.999f, 19.01f)
                curveTo(17.809f, 18.64f, 17.959f, 18.19f, 18.339f, 18f)
                lineTo(20.149f, 17.1f)
                verticalLineTo(14.79f)
                curveTo(20.149f, 14.38f, 20.489f, 14.04f, 20.899f, 14.04f)
                curveTo(21.309f, 14.04f, 21.649f, 14.38f, 21.649f, 14.79f)
                verticalLineTo(17.57f)
                curveTo(21.649f, 17.85f, 21.489f, 18.11f, 21.239f, 18.24f)
                lineTo(19.019f, 19.35f)
                curveTo(18.889f, 19.39f, 18.779f, 19.42f, 18.669f, 19.42f)
                close()
                moveTo(5.329f, 19.42f)
                curveTo(5.219f, 19.42f, 5.099f, 19.39f, 4.999f, 19.34f)
                lineTo(2.779f, 18.23f)
                curveTo(2.529f, 18.1f, 2.369f, 17.84f, 2.369f, 17.56f)
                verticalLineTo(14.78f)
                curveTo(2.369f, 14.37f, 2.709f, 14.03f, 3.119f, 14.03f)
                curveTo(3.529f, 14.03f, 3.869f, 14.37f, 3.869f, 14.78f)
                verticalLineTo(17.09f)
                lineTo(5.679f, 17.99f)
                curveTo(6.049f, 18.18f, 6.199f, 18.63f, 6.019f, 19f)
                curveTo(5.869f, 19.26f, 5.609f, 19.42f, 5.329f, 19.42f)
                close()
                moveTo(11.999f, 14.42f)
                curveTo(11.589f, 14.42f, 11.249f, 14.08f, 11.249f, 13.67f)
                verticalLineTo(11.36f)
                lineTo(9.439f, 10.46f)
                curveTo(9.069f, 10.27f, 8.919f, 9.82f, 9.099f, 9.45f)
                curveTo(9.289f, 9.08f, 9.739f, 8.93f, 10.109f, 9.11f)
                lineTo(11.999f, 10.05f)
                lineTo(13.889f, 9.11f)
                curveTo(14.259f, 8.93f, 14.709f, 9.07f, 14.899f, 9.45f)
                curveTo(15.089f, 9.83f, 14.939f, 10.27f, 14.559f, 10.46f)
                lineTo(12.749f, 11.36f)
                verticalLineTo(13.67f)
                curveTo(12.749f, 14.08f, 12.409f, 14.42f, 11.999f, 14.42f)
                close()
                moveTo(20.889f, 9.97f)
                curveTo(20.479f, 9.97f, 20.139f, 9.63f, 20.139f, 9.22f)
                verticalLineTo(7.66f)
                lineTo(18.999f, 8.23f)
                curveTo(18.629f, 8.42f, 18.179f, 8.27f, 17.989f, 7.89f)
                curveTo(17.799f, 7.52f, 17.949f, 7.07f, 18.329f, 6.88f)
                lineTo(19.209f, 6.44f)
                lineTo(18.329f, 6f)
                curveTo(17.959f, 5.81f, 17.809f, 5.36f, 17.989f, 4.99f)
                curveTo(18.179f, 4.62f, 18.629f, 4.47f, 18.999f, 4.65f)
                lineTo(21.209f, 5.75f)
                curveTo(21.229f, 5.76f, 21.259f, 5.77f, 21.279f, 5.79f)
                curveTo(21.339f, 5.82f, 21.389f, 5.87f, 21.439f, 5.92f)
                curveTo(21.469f, 5.96f, 21.499f, 6f, 21.529f, 6.04f)
                curveTo(21.569f, 6.11f, 21.599f, 6.18f, 21.619f, 6.26f)
                curveTo(21.629f, 6.32f, 21.639f, 6.38f, 21.639f, 6.43f)
                verticalLineTo(6.44f)
                verticalLineTo(9.2f)
                curveTo(21.639f, 9.64f, 21.299f, 9.97f, 20.889f, 9.97f)
                close()
                moveTo(3.109f, 9.97f)
                curveTo(2.699f, 9.97f, 2.359f, 9.63f, 2.359f, 9.22f)
                verticalLineTo(6.46f)
                verticalLineTo(6.45f)
                curveTo(2.359f, 6.39f, 2.369f, 6.33f, 2.379f, 6.28f)
                curveTo(2.399f, 6.2f, 2.429f, 6.13f, 2.469f, 6.06f)
                curveTo(2.499f, 6.01f, 2.529f, 5.97f, 2.569f, 5.93f)
                curveTo(2.609f, 5.89f, 2.659f, 5.85f, 2.709f, 5.82f)
                curveTo(2.729f, 5.81f, 2.759f, 5.79f, 2.779f, 5.78f)
                lineTo(4.989f, 4.68f)
                curveTo(5.359f, 4.5f, 5.809f, 4.64f, 5.999f, 5.02f)
                curveTo(6.189f, 5.4f, 6.039f, 5.84f, 5.659f, 6.03f)
                lineTo(4.779f, 6.47f)
                lineTo(5.659f, 6.91f)
                curveTo(6.029f, 7.1f, 6.179f, 7.55f, 5.999f, 7.92f)
                curveTo(5.809f, 8.29f, 5.369f, 8.44f, 4.989f, 8.26f)
                lineTo(3.849f, 7.69f)
                verticalLineTo(9.25f)
                curveTo(3.859f, 9.64f, 3.529f, 9.97f, 3.109f, 9.97f)
                close()
                moveTo(14.219f, 3.86f)
                curveTo(14.109f, 3.86f, 13.989f, 3.83f, 13.889f, 3.78f)
                lineTo(11.999f, 2.84f)
                lineTo(10.109f, 3.78f)
                curveTo(9.739f, 3.97f, 9.289f, 3.82f, 9.099f, 3.44f)
                curveTo(8.909f, 3.07f, 9.059f, 2.62f, 9.439f, 2.43f)
                lineTo(11.659f, 1.32f)
                curveTo(11.869f, 1.21f, 12.119f, 1.21f, 12.329f, 1.32f)
                lineTo(14.549f, 2.43f)
                curveTo(14.919f, 2.62f, 15.069f, 3.07f, 14.889f, 3.44f)
                curveTo(14.759f, 3.71f, 14.499f, 3.86f, 14.219f, 3.86f)
                close()
            }
        }.build()

        return _Box2!!
    }

@Suppress("ObjectPropertyName")
private var _Box2: ImageVector? = null
